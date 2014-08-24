package com.dpaulenk.nand2tetris.vmtranslator.impl;

public class Init extends Instruction {

    private static Init INIT = new Init();

    private Init() {
        super("init.asm.st");
    }

    public static Init get() {
        return INIT;
    }
}
