package com.dpaulenk.nand2tetris.vmtranslator.impl;

import java.io.*;

public class Instruction {
    public static final String BIN_RES = "bin.asm.st";
    public static final String CMP_RES = "cmp.asm.st";
    public static final String POP_RES = "pop.asm.st";
    public static final String PUSH_RES = "push.asm.st";
    public static final String UNARY_RES = "unary.asm.st";

    private final String template;

    private String[] params;
    private String[] values;

    public Instruction(String template, String... params) {
        this.template = readResource(template);
        this.params = params;
    }

    public String translate(SymbolTable table) {
        prepareTranslate(table);

        String result = template;
        for (int i = 0; i < params.length; i++) {
            result = result.replaceAll("\\$" + params[i] + "\\$", values[i]);
        }

        return result;
    }

    protected void setValues(String... values) {
        this.values = values;
    }

    protected void prepareTranslate(SymbolTable table) {
    }

    protected static String readResource(String template) {
        InputStream resourceAsStream = Instruction.class.getResourceAsStream("/" + template);
        BufferedReader in = new BufferedReader(new InputStreamReader(resourceAsStream));
        try {
            String result = "";
            String line = in.readLine();
            while (line != null) {
                result += line + "\n";
                line = in.readLine();
            }
            return result;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
