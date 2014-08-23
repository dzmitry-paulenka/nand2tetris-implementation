package com.dpaulenk.nand2tetris.vmtranslator.impl;

public class Binary extends Instruction {
    public static final Binary or = new Binary("|");
    public static final Binary and = new Binary("&");
    public static final Binary plus = new Binary("+");
    public static final Binary minus = new Binary("-");

    private Binary(String op) {
        super("bin.asm.st", "OP");
        setValues(op);
    }

    public static Binary get(String op) {
        switch (op) {
            case "and" : return and;
            case "or" : return or;
            case "add" : return plus;
            case "sub" : return minus;
        }
        throw new IllegalStateException("shouldn't be");
    }
}
