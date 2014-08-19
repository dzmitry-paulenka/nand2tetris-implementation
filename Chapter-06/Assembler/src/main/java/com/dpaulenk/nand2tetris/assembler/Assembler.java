package com.dpaulenk.nand2tetris.assembler;

import com.dpaulenk.nand2tetris.assembler.impl.Instruction;
import com.dpaulenk.nand2tetris.assembler.impl.SymbolTable;
import com.dpaulenk.nand2tetris.assembler.parser.AssemblerBaseVisitor;
import com.dpaulenk.nand2tetris.assembler.parser.AssemblerLexer;
import com.dpaulenk.nand2tetris.assembler.parser.AssemblerParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.misc.Nullable;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class Assembler {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Command format:");
            System.out.println("assembler Prog.asm");
            return;
        }

        if (!new File(args[0]).exists()) {
            System.out.println("Input file: " + args[0] + " not found");
            return;
        }

        try {
            MyBaseErrorListener errorListener = new MyBaseErrorListener();

            AssemblerLexer lexer = new AssemblerLexer(new ANTLRFileStream(args[0], "UTF-8"));
            AssemblerParser parser = new AssemblerParser(new CommonTokenStream(lexer));

            lexer.addErrorListener(errorListener);
            parser.addErrorListener(errorListener);

            AssemblerParser.ProgramContext program = parser.program();
            if (errorListener.wasError) {
                System.out.println("Error parsing file...");
                return;
            }

            System.out.println("analyze...");

            AssemblingVisitor assembling = new AssemblingVisitor();
            program.accept(assembling);

            List<Instruction> instructions = assembling.instructions;
            SymbolTable symbolTable = assembling.symbolTable;

            PrintWriter out = new PrintWriter(getHackFileName(args[0]));
            for (Instruction i : instructions) {
                String compiled = i.compile(symbolTable);

                System.out.println(i);
                out.println(compiled);
            }
            out.close();
        } catch (Exception e) {
            System.out.println("Error parsing file: ");
            e.printStackTrace();
        }
    }

    private static String getHackFileName(String asmFileName) {
        int ind = asmFileName.lastIndexOf(".asm");
        if (ind != -1) {
            asmFileName = asmFileName.substring(0, ind);
        }

        return asmFileName + ".hack";
    }

    private static class MyBaseErrorListener extends BaseErrorListener {
        public boolean wasError = false;

        @Override
        public void syntaxError(@NotNull Recognizer<?, ?> recognizer, @Nullable Object offendingSymbol, int line, int charPositionInLine, @NotNull String msg, @Nullable RecognitionException e) {
            wasError = true;
        }
    }
}
