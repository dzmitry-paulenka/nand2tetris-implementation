package com.dpaulenk.nand2tetris.jack;

import com.dpaulenk.nand2tetris.jack.impl.CodeWriter;
import com.dpaulenk.nand2tetris.jack.impl.types.JackType;
import com.dpaulenk.nand2tetris.jack.impl.types.Subroutine;
import com.dpaulenk.nand2tetris.jack.impl.types.SubroutineKind;
import com.dpaulenk.nand2tetris.jack.impl.types.TypeTable;
import com.dpaulenk.nand2tetris.jack.impl.vars.VarScope;
import com.dpaulenk.nand2tetris.jack.impl.vars.VarTable;
import com.dpaulenk.nand2tetris.jack.impl.vars.Variable;
import com.dpaulenk.nand2tetris.jack.parser.CompilerBaseVisitor;
import com.dpaulenk.nand2tetris.jack.parser.CompilerParser;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.ArrayList;
import java.util.List;

public class GenerateCodeVisitor extends CompilerBaseVisitor {
    private static final TypeTable typeTable = TypeTable.instance;

    private final CodeWriter out;

    private JackType currentClass;
    private Subroutine currentSubroutine;

    private VarTable fieldTable;

    private VarTable localTable;

    private int ifCount;
    private int whileCount;

    public GenerateCodeVisitor(CodeWriter out) {
        this.out = out;
    }

    private Object throwError(String error) {
        throw new IllegalStateException(error);
    }

    @Override
    public Object visitClazz(@NotNull CompilerParser.ClazzContext ctx) {
        currentClass = typeTable.get(ctx.className().getText());
        fieldTable = new VarTable();
        return super.visitClazz(ctx);
    }

    @Override
    public Object visitClassVarDec(@NotNull CompilerParser.ClassVarDecContext ctx) {
        VarScope scope = VarScope.fromString(ctx.scopeType().getText());
        JackType type = typeTable.get(ctx.type().getText());

        for (String varName : getVarList(ctx.varList())) {
            fieldTable.define(new Variable(varName, type, scope));
        }

        return null;
    }

    private List<String> getVarList(CompilerParser.VarListContext varListContext) {
        List<String> result = new ArrayList<>();
        for (CompilerParser.VarNameContext varNameCtx : varListContext.getRuleContexts(CompilerParser.VarNameContext.class)) {
            result.add(varNameCtx.getText());
        }
        return result;
    }

    @Override
    public Object visitSubroutineDec(@NotNull CompilerParser.SubroutineDecContext ctx) {
        ifCount = 0;
        whileCount = 0;

        currentSubroutine = currentClass.getSubroutine(ctx.subroutineName().getText());

        localTable = new VarTable(fieldTable);
        if (currentSubroutine.kind == SubroutineKind.METHOD) {
            localTable.define(new Variable("this", null, VarScope.ARGUMENT));
        }

        for (CompilerParser.TypedVarContext typedVar : ctx.parameterList().typedVar()) {
            JackType type = typeTable.get(typedVar.type().getText());
            localTable.define(new Variable(typedVar.varName().getText(), type, VarScope.ARGUMENT));
        }

        return super.visitSubroutineDec(ctx);
    }

    @Override
    public Object visitSubroutineBody(@NotNull CompilerParser.SubroutineBodyContext ctx) {
        List<CompilerParser.VarDecContext> varsDecls = ctx.varDec();
        for (CompilerParser.VarDecContext varsDecl : varsDecls) {
            JackType type = typeTable.get(varsDecl.type().getText());

            for (String varName : getVarList(varsDecl.varList())) {
                localTable.define(new Variable(varName, type, VarScope.LOCAL));
            }
        }

        out.writeFunctionStart(currentClass, currentSubroutine, localTable.scopeVarCount(VarScope.LOCAL));
        if (currentSubroutine.kind == SubroutineKind.CONSTRUCTOR) {
            out.writeConstructorStart(fieldTable.scopeVarCount(VarScope.FIELD));
        } else if (currentSubroutine.kind == SubroutineKind.METHOD) {
            out.writeMethodStart();
        }

        return visitStatements(ctx.statements());
    }

    @Override
    public Object visitReturnStatement(@NotNull CompilerParser.ReturnStatementContext ctx) {
        CompilerParser.ExpressionContext expression = ctx.expression();
        if (expression != null) {
            visitExpression(expression);
        } else {
            out.writePush("constant", 0);
        }

        out.writeReturn();

        return null;
    }

    @Override
    public Object visitDoStatement(@NotNull CompilerParser.DoStatementContext ctx) {
        visitSubroutineCall(ctx.subroutineCall());
        out.writePop("temp", 0);
        return null;
    }

    @Override
    public Object visitSubroutineCall(@NotNull CompilerParser.SubroutineCallContext ctx) {
        boolean shouldBeStatic = true;

        JackType type;

        String qualifier = ctx.qualifier() == null ? null : ctx.qualifier().getText();
        if (qualifier != null) {
            type = typeTable.getOrNull(qualifier);
            if (type == null) {
                //var call
                Variable var = localTable.getMust(qualifier);
                if (var.scope == VarScope.STATIC) {
                    if (currentSubroutine.kind != SubroutineKind.FUNCTION) {
                        return throwError("Static vars should only be used in functions (not methods or constructors)");
                    }
                }

                type = var.type;
                shouldBeStatic = false;

                //push var as first parameter
                out.writePush(var);
            }
        } else {
            type = currentClass;
            if (currentSubroutine.kind != SubroutineKind.FUNCTION) {
                //'this' call, push 'this' as first parameter
                shouldBeStatic = false;
                out.writePush("pointer", 0);
            }
        }

        String name = ctx.subroutineName().getText();
        Subroutine subroutine = type.getSubroutine(name);
        if (subroutine == null) {
            return throwError("Subroutine '" + name + "' isn't defined for class '" + type.name + "'");
        }

        if (subroutine.kind == SubroutineKind.CONSTRUCTOR && qualifier == null) {
            return throwError("You should call constructor qualified by class name");
        }

        //push args
        for (CompilerParser.ExpressionContext expression : ctx.expressionList().expression()) {
            visitExpression(expression);
        }

        out.writeCall(type, subroutine);

        return null;
    }

    @Override
    public Object visitLetStatement(@NotNull CompilerParser.LetStatementContext ctx) {
        String varName = ctx.varName().getText();
        Variable var = localTable.getMust(varName);

        CompilerParser.ArrayIndexingContext indexing = ctx.arrayIndexing();
        if (indexing != null) {
            visitExpression(indexing.expression());
            out.writePush(var);
            out.writeAdd();
        }

        //push expr
        visitExpression(ctx.expression());

        if (indexing != null) {
            out.writePop("temp", 0);
            out.writePop("pointer", 1); //pop var+expr into 'that'
            out.writePush("temp", 0);
            out.writePop("that", 0);
        } else {
            out.writePop(var);
        }

        return null;
    }

    @Override
    public Object visitIfStatement(@NotNull CompilerParser.IfStatementContext ctx) {

        visitExpression(ctx.expression());

        CompilerParser.ElseClauseContext elseClause = ctx.elseClause();

        String trueLabel = "IF_TRUE" + ifCount;
        String falseLabel = "IF_FALSE" + ifCount;
        String endLabel = "IF_END" + ifCount;
        ifCount++;

        out.writeIfGoto(trueLabel);
        out.writeGoto(falseLabel);
        out.writeLabel(trueLabel);

        visitStatements(ctx.statements());
        if (elseClause != null) {
            out.writeGoto(endLabel);
        }

        out.writeLabel(falseLabel);

        if (elseClause != null) {
            visitStatements(elseClause.statements());
            out.writeLabel(endLabel);
        }

        return null;
    }

    @Override
    public Object visitWhileStatement(@NotNull CompilerParser.WhileStatementContext ctx) {
        String expLabel = "WHILE_EXP" + whileCount;
        String endLabel = "WHILE_END" + whileCount;
        whileCount++;

        out.writeLabel(expLabel);

        visitExpression(ctx.expression());
        out.writeNot();

        out.writeIfGoto(endLabel);

        visitStatements(ctx.statements());

        out.writeGoto(expLabel);
        out.writeLabel(endLabel);

        return null;
    }

    @Override
    public Object visitExpression(@NotNull CompilerParser.ExpressionContext ctx) {
        List<CompilerParser.TermContext> terms = ctx.term();
        List<CompilerParser.OpContext> ops = ctx.op();

        visitTerm(terms.get(0));

        for (int i = 1; i < terms.size(); ++i) {
            CompilerParser.OpContext op = ops.get(i - 1);
            CompilerParser.TermContext term = terms.get(i);

            visitTerm(term);

            out.writeBinaryOp(op.getText());
        }

        return null;
    }

    @Override
    public Object visitUnaryExpr(@NotNull CompilerParser.UnaryExprContext ctx) {
        visitTerm(ctx.term());
        out.writeUnaryOp(ctx.unaryOp().getText());
        return null;
    }

    @Override
    public Object visitNumber(@NotNull CompilerParser.NumberContext ctx) {
        int n = Integer.MAX_VALUE;
        try {
            n = Integer.parseInt(ctx.getText());
        } catch (NumberFormatException ignore) {
        }

        if (n < -32768 || n > 32767) {
            return throwError("Number should be in range [-32768..32767]");
        }

        out.writePush("constant", n);

        return null;
    }

    @Override
    public Object visitString(@NotNull CompilerParser.StringContext ctx) {
        String s = ctx.getText();
        s = s.substring(1, s.length() - 1);

        out.writePush("constant", s.length());
        out.writeCall("String.new", 1);

        for (int i = 0; i < s.length(); i++) {
            out.writePush("constant", (int) s.charAt(i));
            out.writeCall("String.appendChar", 2);
        }

        return null;
    }

    @Override
    public Object visitKeywordConstant(@NotNull CompilerParser.KeywordConstantContext ctx) {

        switch (ctx.getText()) {
            case "false":
            case "null":
                out.writePush("constant", 0);
                break;
            case "true":
                out.writePush("constant", 0);
                out.writeNot();
                break;
            case "this":
                if (currentSubroutine.kind == SubroutineKind.FUNCTION) {
                    throwError("this can't be used in a static function");
                }

                out.writePush("pointer", 0);
                break;
        }

        return null;
    }

    @Override
    public Object visitVarExpr(@NotNull CompilerParser.VarExprContext ctx) {
        Variable var = localTable.getMust(ctx.varName().getText());

        out.writePush(var);

        return null;
    }

    @Override
    public Object visitArrayExpr(@NotNull CompilerParser.ArrayExprContext ctx) {
        Variable var = localTable.getMust(ctx.varName().getText());

        visitExpression(ctx.expression());

        out.writePush(var);
        out.writeAdd();
        out.writePop("pointer", 1);
        out.writePush("that", 0);

        return null;
    }
}
