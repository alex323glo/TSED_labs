package com.lab111.labwork3;

/**
 * Created by alex323glo on 26.10.17.
 */
public class Constant implements SimpleExpression {
    private int number;

    public Constant(int number) {
        this.number = number;
    }

    /**
     * Shows all content of expression.
     *
     * @return content of expression, represented as String.
     */
    @Override
    public String show() {
        return String.valueOf(number);
    }
}
