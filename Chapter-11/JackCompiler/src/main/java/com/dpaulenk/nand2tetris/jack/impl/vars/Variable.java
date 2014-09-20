package com.dpaulenk.nand2tetris.jack.impl.vars;

import com.dpaulenk.nand2tetris.jack.impl.types.JackType;

public class Variable {

    public String name;
    public JackType type;
    public VarScope scope;

    public int index = 0;

    public Variable(String name, JackType type, VarScope scope) {
        this.name = name;
        this.type = type;
        this.scope = scope;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
