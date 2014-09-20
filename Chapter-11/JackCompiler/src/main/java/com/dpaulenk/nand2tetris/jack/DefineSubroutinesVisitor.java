package com.dpaulenk.nand2tetris.jack;

import com.dpaulenk.nand2tetris.jack.impl.types.Subroutine;
import com.dpaulenk.nand2tetris.jack.impl.types.SubroutineKind;
import com.dpaulenk.nand2tetris.jack.impl.types.TypeTable;
import com.dpaulenk.nand2tetris.jack.impl.types.JackType;
import com.dpaulenk.nand2tetris.jack.parser.CompilerBaseVisitor;
import com.dpaulenk.nand2tetris.jack.parser.CompilerParser;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.List;

public class DefineSubroutinesVisitor extends CompilerBaseVisitor {
    private final TypeTable typeTable = TypeTable.instance;
    private JackType currentClass;

    @Override
    public Object visitClazz(@NotNull CompilerParser.ClazzContext ctx) {
        String className = ctx.className().getText();

        currentClass = typeTable.get(className);

        return super.visitClazz(ctx);
    }

    @Override
    public Object visitSubroutineDec(@NotNull CompilerParser.SubroutineDecContext ctx) {
        String name = ctx.subroutineName().getText();
        SubroutineKind kind = SubroutineKind.fromString(ctx.subroutineKind().getText());
        JackType returnType = typeTable.get(ctx.returnType().getText());

        List<CompilerParser.TypedVarContext> params = ctx.parameterList().typedVar();
        JackType paramTypes[] = new JackType[params.size()];
        for (int i = 0; i < params.size(); i++) {
            paramTypes[i] = typeTable.get(params.get(i).type().getText());
        }

        currentClass.defineSubroutine(new Subroutine(name, kind, returnType, paramTypes));

        return null;
    }
}
