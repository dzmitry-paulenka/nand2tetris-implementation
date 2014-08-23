package com.dpaulenk.nand2tetris.vmtranslator.impl;

public class SymbolTable {
    private String namespace;
    private int nextSymbol;

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String newSymbol() {
        return "GENERATED_INTERNAL_SYMBOL$$" + nextSymbol++;
    }

    public String staticVarName(int value) {
        return namespace + "." + value;
    }
}
