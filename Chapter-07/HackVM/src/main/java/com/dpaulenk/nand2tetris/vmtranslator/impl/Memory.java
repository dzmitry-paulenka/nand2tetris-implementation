package com.dpaulenk.nand2tetris.vmtranslator.impl;

import static java.lang.String.valueOf;

public class Memory extends Instruction {
    private Memory(String template, String... params) {
        super(template, params);
    }

    private static class PushConst extends Memory {
        private PushConst(int value) {
            super("push-const.asm.st", "VAL");
            setValues(valueOf(value));
        }
    }

    private static class PushPop extends Memory {
        private PushPop(String res, String segment, int value) {
            super(res, "VAL", "SEG");
            setValues(valueOf(value), segment);
        }

    }
    private static class PushPopTemp extends Memory {
        private PushPopTemp(String res, String register) {
            super(res, "REG");
            setValues(register);
        }

    }

    private static class PushPopStatic extends Memory {
        private PushPopStatic(String res, String varName) {
            super(res, "VAR");
            setValues(varName);
        }
    }

    public static Memory get(SymbolTable table, String type, String segment, int value) {
        boolean push = type.equals("push");
        if (segment.equals("static")) {
            return new PushPopStatic(push ? "push-static.asm.st" : "pop-static.asm.st", table.staticVarName(value));
        } else if (segment.equals("temp") || segment.equals("pointer")) {
            if (segment.equals("pointer")) {
                value += 3;
            } else {
                value += 5;
            }
            return new PushPopTemp(push ? "push-temp.asm.st" : "pop-temp.asm.st", "R" + value);
        }

        if (segment.equals("constant")) {
            if (!push) {
                throw new IllegalStateException("pop const isn't supported");
            }
            return new PushConst(value);
        }

        String seg = null;
        switch (segment) {
            case "argument": seg = "ARG"; break;
            case "local": seg = "LCL"; break;
            case "this": seg = "THIS"; break;
            case "that": seg = "THAT"; break;
        }
        return new PushPop(push ? PUSH_RES : POP_RES, seg, value);
    }
}
