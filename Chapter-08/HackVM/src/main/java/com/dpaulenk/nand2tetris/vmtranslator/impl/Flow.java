package com.dpaulenk.nand2tetris.vmtranslator.impl;

public class Flow extends Instruction {
    private Flow(String template, String... params) {
        super(template, params);
    }

    private static class Label extends Flow {
        private Label(String labelName) {
            super("label.asm.st", "LBL");
            setValues(labelName);
        }
    }

    private static class GoTo extends Flow {
        private GoTo(String labelName) {
            super("goto.asm.st", "LBL");
            setValues(labelName);
        }
    }

    private static class IfGoTo extends Flow {
        private IfGoTo(String labelName) {
            super("if-goto.asm.st", "LBL");
            setValues(labelName);
        }
    }

    public static Flow get(String type, String function, String label) {
        String labelName = function + "$" + label;
        switch (type) {
            case "label" : return new Label(labelName);
            case "goto" : return new GoTo(labelName);
            case "if-goto" : return new IfGoTo(labelName);
        }
        throw new IllegalStateException("Shouldn't happen");
    }
}
