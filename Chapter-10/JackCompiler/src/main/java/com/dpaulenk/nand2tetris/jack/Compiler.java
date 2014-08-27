package com.dpaulenk.nand2tetris.jack;

import com.dpaulenk.nand2tetris.jack.parser.CompilerLexer;
import com.dpaulenk.nand2tetris.jack.parser.CompilerParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.misc.Nullable;
import org.apache.commons.lang3.StringEscapeUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import static com.dpaulenk.nand2tetris.jack.parser.CompilerParser.*;

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

        try {

            for (String jackFile : jackFiles) {
                MyBaseErrorListener errorListener = new MyBaseErrorListener();
                CompilingVisitor compilingVisitor = new CompilingVisitor();

                CompilerLexer lexer = new CompilerLexer(new ANTLRFileStream(jackFile, "UTF-8"));
                CommonTokenStream tokenStream = new CommonTokenStream(lexer);

                dumpTokens(getXmlTFileName(jackFile), tokenStream);

                CompilerParser parser = new CompilerParser(tokenStream);

                lexer.addErrorListener(errorListener);
                parser.addErrorListener(errorListener);

                CompilerParser.ClazzContext clazz = parser.clazz();
                if (errorListener.wasError) {
                    System.out.println("Error parsing file: " + jackFile);
                    return;
                }

                clazz.accept(compilingVisitor);

                PrintWriter out = new PrintWriter(getXmlFileName(jackFile));
                out.print(compilingVisitor.getResult());
                out.close();
            }
        } catch (Exception e) {
            System.out.println("Error compiling: " + pathToTranslate);
            e.printStackTrace();
        }
    }

    private static void dumpTokens(String fileName, CommonTokenStream tokenStream) throws FileNotFoundException {
        PrintWriter out = new PrintWriter(fileName);
        out.println("<tokens>");
        int i = 1;
        while (tokenStream.LA(i) != IntStream.EOF) {
            Token t = tokenStream.LT(i++);
            String type = getTokenType(t);
            String text = getTokenText(t);

            out.println("<" + type + "> " + text + " </" + type + ">");
        }
        out.println("</tokens>");
        out.close();
    }

    public static String getTokenText(Token t) {
        String text = t.getText();
        if (t.getType() == STRING) {
            text = text.substring(1, text.length() - 1);
        }

        return StringEscapeUtils.escapeXml11(text);
    }

    public static String getTokenType(Token t) {
        switch (t.getType()) {
            case STRING: return "stringConstant";
            case INTEGER: return "integerConstant";
            case ID: return "identifier";
        }
        return t.getText().length() == 1 ? "symbol" : "keyword";
    }

    private static String getXmlFileName(String jackFileName) {
        int ind = jackFileName.lastIndexOf(".jack");
        if (ind != -1) {
            jackFileName = jackFileName.substring(0, ind);
        }

        return jackFileName + ".xml";
    }

    private static String getXmlTFileName(String jackFileName) {
        int ind = jackFileName.lastIndexOf(".jack");
        if (ind != -1) {
            jackFileName = jackFileName.substring(0, ind);
        }

        return jackFileName + "T.xml";
    }

    private static class MyBaseErrorListener extends BaseErrorListener {
        public boolean wasError = false;

        @Override
        public void syntaxError(@NotNull Recognizer<?, ?> recognizer, @Nullable Object offendingSymbol, int line, int charPositionInLine, @NotNull String msg, @Nullable RecognitionException e) {
            wasError = true;
        }
    }
}
