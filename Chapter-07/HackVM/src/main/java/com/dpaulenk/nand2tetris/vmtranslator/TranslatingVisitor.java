package com.dpaulenk.nand2tetris.vmtranslator;

import com.dpaulenk.nand2tetris.vmtranslator.impl.*;
import com.dpaulenk.nand2tetris.vmtranslator.parser.VMTranslatorBaseVisitor;
import com.dpaulenk.nand2tetris.vmtranslator.parser.VMTranslatorParser;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.ArrayList;
import java.util.List;

public class TranslatingVisitor extends VMTranslatorBaseVisitor {
    public final SymbolTable symbolTable;
    public final List<Instruction> instructions = new ArrayList<Instruction>();

    public TranslatingVisitor(String fileName) {
        symbolTable = new SymbolTable(fileName);
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
    public Object visitMemory(@NotNull VMTranslatorParser.MemoryContext ctx) {
        return Memory.get(symbolTable, ctx.stackOp().getText(), ctx.segment().getText(), Integer.parseInt(ctx.NUMBER().getText()));
    }
}
