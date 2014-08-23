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
        private PushPop(boolean push, String segment, int value) {
            super(push ? "push.asm.st" : "pop.asm.st", "VAL", "SEG");
            setValues(valueOf(value), segment);
        }

    }
    private static class PushPopTemp extends Memory {
        private PushPopTemp(boolean push, String register) {
            super(push ? "push-temp.asm.st" : "pop-temp.asm.st", "REG");
            setValues(register);
        }

    }

    private static class PushPopStatic extends Memory {
        private PushPopStatic(boolean push, String varName) {
            super(push ? "push-static.asm.st" : "pop-static.asm.st", "VAR");
            setValues(varName);
        }
    }

    public static Memory constant(int value) {
        return new PushConst(value);
    }

    public static Memory xStatic(SymbolTable table, String type, int value) {
        boolean push = type.equals("push");
        return new PushPopStatic(push, table.staticVarName(value));
    }

    public static Memory regs(String type, String segment, int value) {
        boolean push = type.equals("push");
        value += segment.equals("pointer") ? 3 : 5;
        return new PushPopTemp(push, "R" + value);
    }

    public static Memory segs(String type, String segment, int value) {
        boolean push = type.equals("push");
        String seg = null;
        switch (segment) {
            case "argument": seg = "ARG"; break;
            case "local": seg = "LCL"; break;
            case "this": seg = "THIS"; break;
            case "that": seg = "THAT"; break;
        }
        return new PushPop(push, seg, value);
    }
}
