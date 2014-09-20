package com.dpaulenk.nand2tetris.jack;

import com.dpaulenk.nand2tetris.jack.impl.CodeWriter;
import com.dpaulenk.nand2tetris.jack.impl.types.JackType;
import com.dpaulenk.nand2tetris.jack.impl.types.TypeTable;
import com.dpaulenk.nand2tetris.jack.parser.CompilerLexer;
import com.dpaulenk.nand2tetris.jack.parser.CompilerParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.misc.Nullable;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static com.dpaulenk.nand2tetris.jack.parser.CompilerParser.ClazzContext;

public class Compiler {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Command format:");
            System.out.println("Compiler <dir or file.jack>");
            return;
        }

        String pathToTranslate = args[0];
        File fileToTranslate = new File(pathToTranslate);

        if (!fileToTranslate.exists()) {
            System.out.println("Input file/dir: " + pathToTranslate + " not found");
            return;
        }

        List<String> jackFiles = new ArrayList<>();
        if (!fileToTranslate.isDirectory()) {
            if (!pathToTranslate.endsWith(".jack")) {
                System.out.println("Command format:");
                System.out.println("Compiler <dir or file.jack>");
                return;
            }
            jackFiles.add(pathToTranslate);
        } else {
            String[] children = fileToTranslate.list();
            if (children != null) {
                for (String child : children) {
                    if (child.endsWith(".jack")) {
                        jackFiles.add(new File(fileToTranslate, child).getPath());
                    }
                }
            }
        }

        List<ClazzContext> parsedClasses = new ArrayList<>();

        for (String jackFile : jackFiles) {
            try {
                MyBaseErrorListener errorListener = new MyBaseErrorListener();

                CompilerLexer lexer = new CompilerLexer(new ANTLRFileStream(jackFile, "UTF-8"));
                CompilerParser parser = new CompilerParser(new CommonTokenStream(lexer));

                lexer.addErrorListener(errorListener);
                parser.addErrorListener(errorListener);

                ClazzContext clazz = parser.clazz();
                if (errorListener.wasError) {
                    System.out.println("Error parsing file: " + jackFile);
                    return;
                }

                if (!clazz.className().getText().equals(getClassName(jackFile))) {
                    System.out.println("Class name '" + clazz.className().getText() + "' should match a file name '" + jackFile + "'");
                    return;
                }

                parsedClasses.add(clazz);
            } catch (Exception e) {
                System.out.println("Error compiling: " + jackFile);
                e.printStackTrace();
            }
        }

        // define all classes
        TypeTable typeTable = TypeTable.instance;
        for (ClazzContext clazz : parsedClasses) {
            typeTable.define(new JackType(clazz.className().getText()));
        }

        // define subroutines
        for (ClazzContext clazz : parsedClasses) {
            clazz.accept(new DefineSubroutinesVisitor());
        }

        //generate code
        for (int i = 0; i < parsedClasses.size(); i++) {
            String jackFile = jackFiles.get(i);

            try {
                CodeWriter codeWriter = new CodeWriter(getVmFileName(jackFile));

                parsedClasses.get(i).accept(new GenerateCodeVisitor(codeWriter));

                codeWriter.close();
            } catch (FileNotFoundException e) {
                System.out.println("Error writing .vm file for : " + jackFile);
                e.printStackTrace();
            }
        }
    }

    private static String getClassName(String jackFileName) {
        String simpleName = new File(jackFileName).getName();

        int ind = simpleName.lastIndexOf(".jack");

        assert ind >= 0;

        return simpleName.substring(0, ind);
    }

    private static String getVmFileName(String jackFileName) {
        int ind = jackFileName.lastIndexOf(".jack");
        if (ind != -1) {
            jackFileName = jackFileName.substring(0, ind);
        }

        return jackFileName + ".vm";
    }

    private static class MyBaseErrorListener extends BaseErrorListener {
        public boolean wasError = false;

        @Override
        public void syntaxError(@NotNull Recognizer<?, ?> recognizer, @Nullable Object offendingSymbol, int line, int charPositionInLine, @NotNull String msg, @Nullable RecognitionException e) {
            wasError = true;
        }
    }
}
