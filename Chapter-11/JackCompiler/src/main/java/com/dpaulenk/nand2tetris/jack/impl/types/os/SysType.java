package com.dpaulenk.nand2tetris.jack.impl.types.os;

import com.dpaulenk.nand2tetris.jack.impl.types.JackType;
import com.dpaulenk.nand2tetris.jack.impl.types.Subroutine;

import static com.dpaulenk.nand2tetris.jack.impl.types.SubroutineKind.FUNCTION;
import static com.dpaulenk.nand2tetris.jack.impl.types.TypeTable.INT;
import static com.dpaulenk.nand2tetris.jack.impl.types.TypeTable.VOID;

public class SysType extends JackType {
    public SysType() {
        super("Sys");

        defineSubroutine(new Subroutine("halt", FUNCTION, VOID));
        defineSubroutine(new Subroutine("error", FUNCTION, VOID, INT));
        defineSubroutine(new Subroutine("wait", FUNCTION, VOID, INT));
    }
}
