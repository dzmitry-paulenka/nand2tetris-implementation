package com.dpaulenk.nand2tetris.vmtranslator.impl;

public class Init extends Instruction {
    public Init() {
        super("init.asm.st", "LOOP");
    }

    @Override
    protected void prepareTranslate(SymbolTable table) {
        setValues(table.newSymbol());
    }

    public static Init get() {
        return new Init();
    }
}
