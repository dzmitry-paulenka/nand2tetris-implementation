package com.dpaulenk.nand2tetris.vmtranslator;

import com.dpaulenk.nand2tetris.vmtranslator.impl.Instruction;
import com.dpaulenk.nand2tetris.vmtranslator.impl.SymbolTable;
import com.dpaulenk.nand2tetris.vmtranslator.parser.VMTranslatorLexer;
import com.dpaulenk.nand2tetris.vmtranslator.parser.VMTranslatorParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.misc.Nullable;

import java.io.File;
import java.io.PrintWriter;
import java.util.List;

public class VMTranslator {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Command format:");
            System.out.println("vmtranslator <dir or file.vm>");
            return;
        }

        if (!new File(args[0]).exists()) {
            System.out.println("Input file/dir: " + args[0] + " not found");
            return;
        }

        try {
            MyBaseErrorListener errorListener = new MyBaseErrorListener();

            VMTranslatorLexer lexer = new VMTranslatorLexer(new ANTLRFileStream(args[0], "UTF-8"));
            VMTranslatorParser parser = new VMTranslatorParser(new CommonTokenStream(lexer));

            lexer.addErrorListener(errorListener);
            parser.addErrorListener(errorListener);

            VMTranslatorParser.ProgramContext program = parser.program();
            if (errorListener.wasError) {
                System.out.println("Error parsing file...");
                return;
            }

            System.out.println("analyze...");

            TranslatingVisitor assembling = new TranslatingVisitor(getNS(args[0]));
            program.accept(assembling);

            List<Instruction> instructions = assembling.instructions;
            SymbolTable symbolTable = assembling.symbolTable;

            PrintWriter out = new PrintWriter(getAsmFileName(args[0]));
            for (Instruction i : instructions) {
                System.out.println(i);
                out.println(i.translate(symbolTable));
            }
            out.close();
        } catch (Exception e) {
            System.out.println("Error parsing file: ");
            e.printStackTrace();
        }
    }

    private static String getNS(String fileName) {
        String ns = new File(fileName).getName();
        int ind = ns.lastIndexOf(".vm");
        if (ind != -1) {
            ns = ns.substring(0, ind);
        }
        return ns;
    }

    private static String getAsmFileName(String asmFileName) {
        int ind = asmFileName.lastIndexOf(".vm");
        if (ind != -1) {
            asmFileName = asmFileName.substring(0, ind);
        }

        return asmFileName + ".asm";
    }

    private static class MyBaseErrorListener extends BaseErrorListener {
        public boolean wasError = false;

        @Override
        public void syntaxError(@NotNull Recognizer<?, ?> recognizer, @Nullable Object offendingSymbol, int line, int charPositionInLine, @NotNull String msg, @Nullable RecognitionException e) {
            wasError = true;
        }
    }
}
