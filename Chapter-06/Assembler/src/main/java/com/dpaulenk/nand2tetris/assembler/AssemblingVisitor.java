package com.dpaulenk.nand2tetris.assembler;

import com.dpaulenk.nand2tetris.assembler.impl.Instruction;
import com.dpaulenk.nand2tetris.assembler.impl.SymbolTable;
import com.dpaulenk.nand2tetris.assembler.parser.AssemblerBaseVisitor;
import com.dpaulenk.nand2tetris.assembler.parser.AssemblerParser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class AssemblingVisitor extends AssemblerBaseVisitor {
    public final SymbolTable symbolTable = new SymbolTable();
    public final List<Instruction> instructions = new ArrayList<Instruction>();

    @Override
    public Object visitProgram(@NotNull AssemblerParser.ProgramContext ctx) {
        super.visitProgram(ctx);
        symbolTable.calculateVars();
        return null;
    }

    @Override
    public Object visitLabelWithInstruction(@NotNull AssemblerParser.LabelWithInstructionContext ic) {
        Instruction instruction = (Instruction) ic.instruction().accept(this);
        List<AssemblerParser.LabelContext> labels = ic.label();
        if (labels != null) {
            for (AssemblerParser.LabelContext label : labels) {
                symbolTable.regLabel(label.SYMBOL().getText(), instructions.size());
            }
        }

        instructions.add(instruction);

        return instruction;
    }

    @Override
    public Object visitAinstr(@NotNull AssemblerParser.AinstrContext ac) {
        AssemblerParser.AddressContext address = ac.address();
        if (address != null) {
            try {
                int naddress = Integer.parseInt(address.getText());
                if (naddress > 65535) {
                    throw new NumberFormatException();
                }
                return new Instruction(naddress);
            } catch (NumberFormatException nfe) {
                throw new IllegalStateException("Wrong address: " + address.getText());
            }
        } else {
            TerminalNode symbol = ac.SYMBOL();

            assert symbol != null;

            symbolTable.regVar(symbol.getText());

            return new Instruction(symbol.getText());
        }
    }

    @Override
    public Object visitCinstr(@NotNull AssemblerParser.CinstrContext cc) {
        AssemblerParser.DestContext dest = cc.dest();
        AssemblerParser.CompContext comp = cc.comp();
        AssemblerParser.JumpContext jump = cc.jump();

        String d = dest == null ? null : dest.getText();
        String c = comp == null ? null : comp.getText();
        String j = jump == null ? null : jump.getText();

        return new Instruction(d, c, j);
    }
}
