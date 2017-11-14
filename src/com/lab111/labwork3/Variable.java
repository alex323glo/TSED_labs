package com.lab111.labwork3;

/**
 * Created by alex323glo on 26.10.17.
 */
public class Variable implements SimpleExpression {
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    /**
     * Shows all content of expression.
     *
     * @return content of expression, represented as String.
     */
    @Override
    public String show() {
        return name;
    }
}
