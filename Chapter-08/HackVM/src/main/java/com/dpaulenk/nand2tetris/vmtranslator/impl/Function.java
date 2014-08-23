package com.dpaulenk.nand2tetris.vmtranslator.impl;

public class Function extends Instruction {
    private Function(String template, String... params) {
        super(template, params);
    }

    private static class FunctionImpl extends Function {
        private final String functionName;
        private final int locals;

        private FunctionImpl(String functionName, int locals) {
            super("function.asm.st", "FN", "LCNT", "LOOP", "END");
            this.functionName = functionName;
            this.locals = locals;
        }

        @Override
        protected void prepareTranslate(SymbolTable table) {
            setValues(functionName, String.valueOf(locals), table.newSymbol(), table.newSymbol());
        }
    }

    private static class Call extends Function {
        private final String functionName;
        private final int args;

        private Call(String functionName, int args) {
            super("call.asm.st", "FN", "ACNT5", "RET");
            this.functionName = functionName;
            this.args = args;
        }

        @Override
        protected void prepareTranslate(SymbolTable table) {
            setValues(functionName, String.valueOf(args + 5), table.newSymbol());
        }
    }

    private static class Return extends Function {
        private Return() {
            super("return.asm.st");
        }
    }

    public static Function function(String name, int locals) {
        return new FunctionImpl(name, locals);
    }

    public static Function call(String name, int args) {
        return new Call(name, args);
    }

    public static Function ret() {
        return new Return();
    }
}
