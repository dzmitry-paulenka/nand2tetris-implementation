package com.dpaulenk.nand2tetris.vmtranslator;

import com.dpaulenk.nand2tetris.vmtranslator.impl.*;
import com.dpaulenk.nand2tetris.vmtranslator.parser.VMTranslatorBaseVisitor;
import com.dpaulenk.nand2tetris.vmtranslator.parser.VMTranslatorParser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class TranslatingVisitor extends VMTranslatorBaseVisitor {
    public static final int MAX_LOCALS = 256;
    public static final int MAX_ARGS = 256;

    public final SymbolTable symbolTable;
    public final List<Instruction> instructions;

    private String currentFunction;

    public TranslatingVisitor() {
        symbolTable = new SymbolTable();
        instructions = new ArrayList<>();
        instructions.add(Init.get());
    }

    @Override
    public Object visitProgram(@NotNull VMTranslatorParser.ProgramContext ctx) {
        super.visitProgram(ctx);
        return null;
    }

    @Override
    public Object visitInstruction(@NotNull VMTranslatorParser.InstructionContext ic) {
        Instruction instruction = (Instruction) super.visitInstruction(ic);
        instructions.add(instruction);
        return instruction;
    }

    @Override
    public Object visitUnary(@NotNull VMTranslatorParser.UnaryContext ctx) {
        return Unary.get(ctx.getText());
    }

    @Override
    public Object visitBinary(@NotNull VMTranslatorParser.BinaryContext ctx) {
        return Binary.get(ctx.getText());
    }

    @Override
    public Object visitCompare(@NotNull VMTranslatorParser.CompareContext ctx) {
        return Compare.get(ctx.getText());
    }

    @Override
    public Object visitStackConst(@NotNull VMTranslatorParser.StackConstContext ctx) {
        return Memory.constant(number(ctx.NUMBER()));
    }

    @Override
    public Object visitStackStatic(@NotNull VMTranslatorParser.StackStaticContext ctx) {
        return Memory.xStatic(symbolTable, ctx.stackOp().getText(), number(ctx.NUMBER()));
    }

    @Override
    public Object visitStackSegs(@NotNull VMTranslatorParser.StackSegsContext ctx) {
        return Memory.segs(ctx.stackOp().getText(), ctx.segment().getText(), number(ctx.NUMBER()));
    }

    @Override
    public Object visitStackRegs(@NotNull VMTranslatorParser.StackRegsContext ctx) {
        return Memory.regs(ctx.stackOp().getText(), ctx.regSegment().getText(), number(ctx.NUMBER()));
    }

    @Override
    public Object visitFlow(@NotNull VMTranslatorParser.FlowContext ctx) {
        return Flow.get(ctx.getChild(0).getText(), currentFunction, ctx.SYMBOL().getText());
    }

    @Override
    public Object visitFunction(@NotNull VMTranslatorParser.FunctionContext ctx) {
        currentFunction = ctx.SYMBOL().getText();

        int locals = getNumber(ctx.NUMBER(), Integer.MAX_VALUE);
        if (locals > MAX_LOCALS) {
            throw new IllegalStateException("too many local variables");
        }

        return Function.function(currentFunction, locals);
    }

    private int getNumber(TerminalNode NUMBER, int def) {
        int n = def;
        try {
            n = Integer.parseInt(NUMBER.getText());
        } catch (NumberFormatException ignore) {
        }
        return n;
    }

    private int number(TerminalNode number) {
        return Integer.parseInt(number.getText());
    }

    @Override
    public Object visitCall(@NotNull VMTranslatorParser.CallContext ctx) {
        int args = getNumber(ctx.NUMBER(), Integer.MAX_VALUE);
        if (args > MAX_ARGS) {
            throw new IllegalStateException("too many arguments");
        }
        return Function.call(ctx.SYMBOL().getText(), args);
    }

    @Override
    public Object visitXreturn(@NotNull VMTranslatorParser.XreturnContext ctx) {
        return Function.ret();
    }
}
