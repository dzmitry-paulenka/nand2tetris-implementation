package com.dpaulenk.nand2tetris.vmtranslator.impl;

public class Unary extends Instruction {
    public static final Unary not = new Unary("!");
    public static final Unary neg = new Unary("-");

    private Unary(String op) {
        super("unary.asm.st", "OP");
        setValues(op);
    }

    public static Unary get(String op) {
        return op.equals("not") ? not : neg;
    }
}
