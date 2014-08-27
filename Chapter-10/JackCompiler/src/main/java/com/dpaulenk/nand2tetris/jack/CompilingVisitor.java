package com.dpaulenk.nand2tetris.jack;

import com.dpaulenk.nand2tetris.jack.parser.CompilerBaseVisitor;
import com.dpaulenk.nand2tetris.jack.parser.CompilerParser;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Stack;

public class CompilingVisitor extends CompilerBaseVisitor {
    private Stack<String> indents = new Stack<>();
    private String result = "";


    private void pushIndent() {
        indents.push(indent() + "  ");
    }

    private void popIndent() {
        indents.pop();
    }

    private String indent() {
        return indents.isEmpty() ? "" : indents.peek();
    }

    private void addLine(String line) {
        result += indent() + line + "\n";
    }

    public String getResult() {
        return result;
    }

    @Override
    public Object visitChildren(@NotNull RuleNode node) {
        return super.visitChildren(node);
    }

    @Override
    public Object visitTerminal(@NotNull TerminalNode node) {
        Token t = node.getSymbol();
        String type = Compiler.getTokenType(t);
        String text = Compiler.getTokenText(t);

        addLine("<" + type + "> " + text + " </" + type + ">");

        return super.visitTerminal(node);
    }

    @Override
    public Object visitClazz(@NotNull CompilerParser.ClazzContext ctx) {
        addLine("<class>");

        pushIndent();

        super.visitClazz(ctx);

        popIndent();

        addLine("</class>");

        return null;
    }

    @Override
    public Object visitVarDec(@NotNull CompilerParser.VarDecContext ctx) {
        addLine("<varDec>");

        pushIndent();
        super.visitVarDec(ctx);
        popIndent();

        addLine("</varDec>");

        return null;
    }

    @Override
    public Object visitSubroutineDec(@NotNull CompilerParser.SubroutineDecContext ctx) {
        addLine("<subroutineDec>");

        pushIndent();
        super.visitSubroutineDec(ctx);
        popIndent();

        addLine("</subroutineDec>");

        return null;
    }

    @Override
    public Object visitParameterList(@NotNull CompilerParser.ParameterListContext ctx) {
        addLine("<parameterList>");

        pushIndent();
        super.visitParameterList(ctx);
        popIndent();

        addLine("</parameterList>");

        return null;
    }

    @Override
    public Object visitSubroutineBody(@NotNull CompilerParser.SubroutineBodyContext ctx) {
        addLine("<subroutineBody>");

        pushIndent();
        super.visitSubroutineBody(ctx);
        popIndent();

        addLine("</subroutineBody>");

        return null;
    }

    @Override
    public Object visitClassVarDec(@NotNull CompilerParser.ClassVarDecContext ctx) {
        addLine("<classVarDec>");

        pushIndent();
        super.visitClassVarDec(ctx);
        popIndent();

        addLine("</classVarDec>");

        return null;
    }

    @Override
    public Object visitStatements(@NotNull CompilerParser.StatementsContext ctx) {
        addLine("<statements>");

        pushIndent();
        super.visitStatements(ctx);
        popIndent();

        addLine("</statements>");

        return null;
    }

    @Override
    public Object visitWhileStatement(@NotNull CompilerParser.WhileStatementContext ctx) {
        addLine("<whileStatement>");

        pushIndent();
        super.visitWhileStatement(ctx);
        popIndent();

        addLine("</whileStatement>");

        return null;
    }

    @Override
    public Object visitIfStatement(@NotNull CompilerParser.IfStatementContext ctx) {
        addLine("<ifStatement>");

        pushIndent();
        super.visitIfStatement(ctx);
        popIndent();

        addLine("</ifStatement>");

        return null;
    }

    @Override
    public Object visitLetStatement(@NotNull CompilerParser.LetStatementContext ctx) {
        addLine("<letStatement>");

        pushIndent();
        super.visitLetStatement(ctx);
        popIndent();

        addLine("</letStatement>");

        return null;
    }

    @Override
    public Object visitDoStatement(@NotNull CompilerParser.DoStatementContext ctx) {
        addLine("<doStatement>");

        pushIndent();
        super.visitDoStatement(ctx);
        popIndent();

        addLine("</doStatement>");

        return null;
    }

    @Override
    public Object visitReturnStatement(@NotNull CompilerParser.ReturnStatementContext ctx) {
        addLine("<returnStatement>");

        pushIndent();
        super.visitReturnStatement(ctx);
        popIndent();

        addLine("</returnStatement>");

        return null;
    }

    @Override
    public Object visitExpression(@NotNull CompilerParser.ExpressionContext ctx) {
        addLine("<expression>");

        pushIndent();
        super.visitExpression(ctx);
        popIndent();

        addLine("</expression>");

        return null;
    }

    @Override
    public Object visitExpressionList(@NotNull CompilerParser.ExpressionListContext ctx) {
        addLine("<expressionList>");

        pushIndent();
        super.visitExpressionList(ctx);
        popIndent();

        addLine("</expressionList>");

        return null;
    }

    @Override
    public Object visitTerm(@NotNull CompilerParser.TermContext ctx) {
        addLine("<term>");

        pushIndent();
        super.visitTerm(ctx);
        popIndent();

        addLine("</term>");

        return null;
    }
}
