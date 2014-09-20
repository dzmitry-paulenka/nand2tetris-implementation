package com.dpaulenk.nand2tetris.jack.impl.types;

public enum SubroutineKind {
    METHOD, CONSTRUCTOR, FUNCTION;

    public static SubroutineKind fromString(String kind) {
        switch (kind) {
            case "constructor" : return CONSTRUCTOR;
            case "method" : return METHOD;
            case "function" : return FUNCTION;
        }
        throw new IllegalStateException("Unknown subroutine kind: " + kind);
    }
}
