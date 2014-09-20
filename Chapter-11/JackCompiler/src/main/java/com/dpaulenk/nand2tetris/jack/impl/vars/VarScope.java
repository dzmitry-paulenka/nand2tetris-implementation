package com.dpaulenk.nand2tetris.jack.impl.vars;

public enum VarScope {
    STATIC, FIELD, ARGUMENT, LOCAL;

    public boolean conflicts(VarScope other) {
        switch (this) {
            case STATIC:
                return other == STATIC;
            case FIELD:
                return other == FIELD;
            case ARGUMENT:
            case LOCAL:
                return other == ARGUMENT || other == LOCAL;
        }
        throw new IllegalStateException("Shouldn't happen");
    }

    public String segment() {
        switch (this) {
            case STATIC: return "static";
            case FIELD: return "this";
            case ARGUMENT: return "argument";
            case LOCAL: return "local";
        }
        throw new IllegalStateException("Shouldn't happen");
    }

    public static VarScope fromString(String scope) {
        switch (scope) {
            case "static": return STATIC;
        }
        return FIELD;
    }
}
