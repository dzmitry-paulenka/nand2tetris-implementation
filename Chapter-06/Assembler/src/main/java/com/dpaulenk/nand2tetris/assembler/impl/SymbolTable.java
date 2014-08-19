package com.dpaulenk.nand2tetris.assembler.impl;

import java.util.*;

public class SymbolTable {
    private final Map<String, Integer> nameToAddress = new HashMap<String, Integer>();

    private final Set<String> labels = new HashSet<String>();
    private final LinkedHashSet<String> vars = new LinkedHashSet<String>();

    public SymbolTable() {
        regLabel("SP", 0);
        regLabel("LCL", 1);
        regLabel("ARG", 2);
        regLabel("THIS", 3);
        regLabel("THAT", 4);
        regLabel("SCREEN", 16384);
        regLabel("KBD", 24576);
        for (int i = 0; i < 16; ++i) {
            regLabel("R" + i, i);
        }
    }

    public void regVar(String symbol) {
        if (!labels.contains(symbol) && !vars.contains(symbol)) {
            vars.add(symbol);
        }
    }

    public void regLabel(String symbol, int address) {
        vars.remove(symbol);
        labels.add(symbol);

        if (nameToAddress.containsKey(symbol)) {
            throw new IllegalStateException("Symbol '" + symbol + "' is already defined");
        }
        nameToAddress.put(symbol, address);
    }

    public void calculateVars() {
        int nextVarAddress = 16;
        for (String var : vars) {
            nameToAddress.put(var, nextVarAddress++);
        }
    }

    public int address(String symbol) {
        Integer addr = nameToAddress.get(symbol);
        if (addr == null) {
            throw new IllegalStateException("Symbol " + symbol + "not found");
        }
        return addr;
    }
}
