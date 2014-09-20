package com.dpaulenk.nand2tetris.jack.impl;

import com.dpaulenk.nand2tetris.jack.impl.types.JackType;
import com.dpaulenk.nand2tetris.jack.impl.types.Subroutine;
import com.dpaulenk.nand2tetris.jack.impl.types.SubroutineKind;
import com.dpaulenk.nand2tetris.jack.impl.vars.Variable;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.StringWriter;

public class CodeWriter {
    private final StringWriter stringOut;
    private final PrintWriter out;

    public CodeWriter() {
        stringOut = new StringWriter();
        this.out = new PrintWriter(stringOut);
    }

    public CodeWriter(String fileName) throws FileNotFoundException {
        stringOut = null;
        out = new PrintWriter(fileName);

    }

    public void close() {
        out.close();
    }

    public String toString() {
        return stringOut.toString();
    }

    int linesWritten = 0;
    private void printLine(String s) {
        out.println(s);
        linesWritten++;
    }

    public void writeFunctionStart(JackType clazz, Subroutine subroutine, int locals) {
        String name = clazz.name + "." + subroutine.name;
        String s = "function " + name + " " + locals;
        printLine(s);
    }

    public void writeConstructorStart(int fieldCount) {
//        push constant 3
//        call Memory.alloc 1
//        pop pointer 0
        writePush("constant", fieldCount);
        writeCall("Memory.alloc", 1);
        writePop("pointer", 0);
    }

    public void writeMethodStart() {
        writePush("argument", 0);
        writePop("pointer", 0);
    }

    public void writePush(Variable var) {
        writePush(var.scope.segment(), var.index);
    }

    public void writePop(Variable var) {
        writePop(var.scope.segment(), var.index);
    }

    public void writePush(String segment, Object value) {
        printLine("push " + segment + " " + value);
    }

    public void writePop(String segment, Object value) {
        printLine("pop " + segment + " " + value);
    }

    public void writeLine(String line) {
        printLine(line);
    }

    public void writeDirect(String content) {
        out.print(content);
    }

    public void writeReturn() {
        printLine("return");
    }

    public void writeCall(JackType clazz, Subroutine subroutine) {
        String name = clazz.name + "." + subroutine.name;

        int argCount = subroutine.paramTypes.length;
        if (subroutine.kind == SubroutineKind.METHOD) {
            argCount++;
        }

        writeCall(name, argCount);
    }

    public void writeCall(String fullName, int argCount) {
        printLine("call " + fullName + " " + argCount);
    }

    public void writeAdd() {
        writeBinaryOp("+");
    }

    public void writeNot() {
        writeUnaryOp("~");
    }

    public void writeBinaryOp(String op) {
//        op : '+' | '-' | '*' | '/' | '&' | '|' | '<' | '>' | '=';
        switch (op) {
            case "+" : writeLine("add"); return;
            case "-" : writeLine("sub"); return;
            case "*" : writeCall("Math.multiply", 2); return;
            case "/" : writeCall("Math.divide", 2); return;
            case "&" : writeLine("and"); return;
            case "|" : writeLine("or"); return;
            case "<" : writeLine("lt"); return;
            case ">" : writeLine("gt"); return;
            case "=" : writeLine("eq"); return;
        }
        throw new IllegalStateException("Shouldn't happen");
    }

    public void writeUnaryOp(String op) {
//        op : '-' | '~';
        switch (op) {
            case "-" : writeLine("neg"); return;
            case "~" : writeLine("not"); return;
        }
        throw new IllegalStateException("Shouldn't happen");
    }

    public void writeIfGoto(String labelName) {
        printLine("if-goto " + labelName);
    }

    public void writeGoto(String labelName) {
        printLine("goto " + labelName);
    }

    public void writeLabel(String labelName) {
        printLine("label " + labelName);
    }
}
