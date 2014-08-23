package com.dpaulenk.nand2tetris.vmtranslator.impl;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Instruction {

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
            String val = Matcher.quoteReplacement(values[i]);
            result = result.replaceAll("\\$" + params[i] + "\\$", val);
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
