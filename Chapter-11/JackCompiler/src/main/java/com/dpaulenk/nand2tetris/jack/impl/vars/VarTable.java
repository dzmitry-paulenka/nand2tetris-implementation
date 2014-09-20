package com.dpaulenk.nand2tetris.jack.impl.vars;

import java.util.HashMap;
import java.util.Map;

public class VarTable {
    private final VarTable parent;

    private final Map<String, Variable> variableMap = new HashMap<>();
    private final Map<VarScope, Integer> scopeCounts = new HashMap<>();

    public VarTable() {
        this(null);
    }

    public VarTable(VarTable parent) {
        this.parent = parent;
        for (VarScope scope : VarScope.values()) {
            scopeCounts.put(scope, 0);
        }
    }

    public Variable get(String name) {
        Variable variable = variableMap.get(name);
        if (variable == null && parent != null) {
            variable = parent.get(name);
        }
        return variable;
    }

    public Variable getMust(String name) {
        Variable var = get(name);
        if (var == null) {
            throw new IllegalStateException("Variable '" + name + "' isn't found");
        }
        return var;
    }

    public void define(Variable var) {
        String name = var.name;
        VarScope scope = var.scope;

        Variable oldVar = get(name);
        if (oldVar != null && oldVar.scope.conflicts(scope)) {
            throw new IllegalStateException("Variable '" + name + "' is already defined.");
        }

        int index = scopeCounts.get(scope);
        scopeCounts.put(scope, index + 1);

        var.setIndex(index);

        variableMap.put(name, var);
    }

    public int scopeVarCount(VarScope scope) {
        return scopeCounts.get(scope);
    }
}
