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
import java.util.ArrayList;
import java.util.List;

public class VMTranslator {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Command format:");
            System.out.println("vmtranslator <dir or file.vm>");
            return;
        }

        String pathToTranslate = args[0];
        File fileToTranslate = new File(pathToTranslate);

        if (!fileToTranslate.exists()) {
            System.out.println("Input file/dir: " + pathToTranslate + " not found");
            return;
        }

        String asmFileName = getAsmFileName(pathToTranslate);

        List<String> vmFiles = new ArrayList<>();
        if (!fileToTranslate.isDirectory()) {
            vmFiles.add(pathToTranslate);
        } else {
            asmFileName = new File(fileToTranslate, getFileNameSpace(pathToTranslate) + ".asm").getPath();

            String[] children = fileToTranslate.list();
            if (children != null) {
                for (String child : children) {
                    if (child.endsWith(".vm")) {
                        vmFiles.add(new File(fileToTranslate, child).getPath());
                    }
                }
            }
        }

        try {
            MyBaseErrorListener errorListener = new MyBaseErrorListener();
            TranslatingVisitor assembling = new TranslatingVisitor();

            for (String vmFile : vmFiles) {
                VMTranslatorLexer lexer = new VMTranslatorLexer(new ANTLRFileStream(vmFile, "UTF-8"));
                VMTranslatorParser parser = new VMTranslatorParser(new CommonTokenStream(lexer));

                lexer.addErrorListener(errorListener);
                parser.addErrorListener(errorListener);

                VMTranslatorParser.ProgramContext program = parser.program();
                if (errorListener.wasError) {
                    System.out.println("Error parsing file: " + vmFile);
                    return;
                }

                assembling.symbolTable.setNamespace(getFileNameSpace(vmFile));
                program.accept(assembling);
            }

            List<Instruction> instructions = assembling.instructions;
            SymbolTable symbolTable = assembling.symbolTable;

            PrintWriter out = new PrintWriter(asmFileName);
            for (Instruction i : instructions) {
//                System.out.println(i);
                out.println(i.translate(symbolTable));
            }
            out.close();
        } catch (Exception e) {
            System.out.println("Error parsing file: ");
            e.printStackTrace();
        }
    }

    private static String getFileNameSpace(String fileName) {
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
