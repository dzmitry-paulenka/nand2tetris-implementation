package com.dpaulenk.nand2tetris.vmtranslator.impl;

import java.util.*;

public class SymbolTable {
    private final String fileName;
    int nextLabel;

    public SymbolTable(String fileName) {
        this.fileName = fileName;
    }

    public String newLabel() {
        return "LABEL" + nextLabel++;
    }

    public String staticVarName(int value) {
        return fileName + "." + value;
    }
}
