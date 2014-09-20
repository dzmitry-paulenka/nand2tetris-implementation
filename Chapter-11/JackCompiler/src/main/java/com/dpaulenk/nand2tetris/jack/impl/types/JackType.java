package com.dpaulenk.nand2tetris.jack.impl.types;

import java.util.HashMap;
import java.util.Map;

public class JackType {
    public final String name;
    public final Map<String, Subroutine> subroutines = new HashMap<>();

    public JackType(String name) {
        this.name = name;
    }

    public void defineSubroutine(Subroutine subroutine) {
        String name = subroutine.name;
        if (subroutines.containsKey(name)) {
            throw new IllegalStateException("Subroutine '" + name + "' is already defined");
        }
        subroutines.put(name, subroutine);
    }

    public Subroutine getSubroutine(String name) {
        return subroutines.get(name);
    }
}
