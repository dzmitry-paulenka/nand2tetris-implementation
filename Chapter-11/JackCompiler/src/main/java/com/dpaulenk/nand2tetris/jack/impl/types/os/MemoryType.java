package com.dpaulenk.nand2tetris.jack.impl.types.os;

import com.dpaulenk.nand2tetris.jack.impl.types.JackType;
import com.dpaulenk.nand2tetris.jack.impl.types.Subroutine;

import static com.dpaulenk.nand2tetris.jack.impl.types.SubroutineKind.FUNCTION;
import static com.dpaulenk.nand2tetris.jack.impl.types.TypeTable.*;

public class MemoryType extends JackType {
    public MemoryType() {
        super("Memory");

        defineSubroutine(new Subroutine("peek", FUNCTION, INT, INT));
        defineSubroutine(new Subroutine("poke", FUNCTION, VOID, INT, INT));
        defineSubroutine(new Subroutine("alloc", FUNCTION, ARRAY, INT));
        defineSubroutine(new Subroutine("deAlloc", FUNCTION, VOID, ARRAY));
    }
}
