package com.dpaulenk.nand2tetris.vmtranslator.impl;

public class Compare extends Instruction {
    private final String type;

    public Compare(String type) {
        super(CMP_RES, "HIT", "END", "CMP");
        this.type = type;
    }

    @Override
    protected void prepareTranslate(SymbolTable table) {
        setValues(table.newLabel(), table.newLabel(), type);
    }

    public static Compare get(String type) {
        return new Compare("J" + type.toUpperCase());
    }
}
