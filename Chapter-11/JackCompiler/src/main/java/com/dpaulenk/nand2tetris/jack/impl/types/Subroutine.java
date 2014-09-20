package com.dpaulenk.nand2tetris.jack.impl.types;

public class Subroutine {
    public final String name;
    public final SubroutineKind kind;
    public final JackType returnType;

    public final JackType[] paramTypes;

    public Subroutine(String name, SubroutineKind kind, JackType returnType, JackType... paramTypes) {
        this.name = name;
        this.kind = kind;
        this.returnType = returnType;
        this.paramTypes = paramTypes;
    }
}
