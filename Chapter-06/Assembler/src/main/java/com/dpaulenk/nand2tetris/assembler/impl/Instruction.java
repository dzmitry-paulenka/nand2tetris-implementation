package com.dpaulenk.nand2tetris.assembler.impl;

import java.util.List;

public class Instruction {
    //a-command
    public int address = -1;
    public String symbol;

    //c-command
    public String dest;
    public String comp;
    public String jump;

    public Instruction(int address) {
        this.address = address;
    }

    public Instruction(String symbol) {
        this.symbol = symbol;
    }

    public Instruction(String dest, String comp, String jump) {
        this.dest = dest;
        this.comp = comp;
        this.jump = jump;
    }

    public String compile(SymbolTable symbolTable) {
        if (address >= 0) {
            return compileA(address);
        } else if (symbol != null) {
            return compileA(symbolTable.address(symbol));
        } else {
            return compileC();
        }
    }

    private String compileA(int address) {
        String bin = Integer.toString(address, 2);

        assert bin.length() < 16;

        String padding = "";
        for (int i = bin.length(); i < 16; ++i) {
            padding += '0';
        }

        return padding + bin;
    }

    private String compileC() {
        return "111" + getCompString() + getDestString() + getJumpString();
    }

    private String getDestString() {
        if (dest == null) {
            return "000";
        }

        switch (dest) {
            case "M"    : return "001";
            case "D"    : return "010";
            case "MD"   : return "011";
            case "A"    : return "100";
            case "AM"   : return "101";
            case "AD"   : return "110";
            case "AMD"  : return "111";
        }
        throw new IllegalStateException("Unknown dest: " + dest);
    }

    private String getJumpString() {
        if (jump == null) {
            return "000";
        }
        switch (jump) {
            case "JGT" : return "001";
            case "JEQ" : return "010";
            case "JGE" : return "011";
            case "JLT" : return "100";
            case "JNE" : return "101";
            case "JLE" : return "110";
            case "JMP" : return "111";
        }
        throw new IllegalStateException("Unknown jump: " + jump);
    }

    private String getCompString() {
        assert comp != null;

        String c = comp.replaceAll("\\s+", "");

        switch (c) {
            case "0" : return "0101010";
            case "1" : return "0111111";
            case "-1" : return "0111010";
            case "D" : return "0001100";
            case "A" : return "0110000";
            case "M" : return "1110000";
            case "!D" : return "0001101";
            case "!A" : return "0110001";
            case "!M" : return "1110001";
            case "-D" : return "0001111";
            case "-A" : return "0110011";
            case "-M" : return "1110011";
            case "D+1" : return "0011111";
            case "A+1" : return "0110111";
            case "M+1" : return "1110111";
            case "D-1" : return "0001110";
            case "A-1" : return "0110010";
            case "M-1" : return "1110010";
            case "D+A" : return "0000010";
            case "D+M" : return "1000010";
            case "D-A" : return "0010011";
            case "D-M" : return "1010011";
            case "A-D" : return "0000111";
            case "M-D" : return "1000111";
            case "D&A" : return "0000000";
            case "D&M" : return "1000000";
            case "D|A" : return "0010101";
            case "D|M" : return "1010101";
        }
        throw new IllegalStateException("Unknown comp: " + comp);
    }

    @Override
    public String toString() {
        if (address >= 0) {
            return "@" + address;
        } else if (symbol != null) {
            return "@" + symbol;
        }
        return
            (dest == null ? "" : dest + "=") +
            comp +
            (jump == null ? "" : ";" + jump);
    }
}
