package com.lab111.labwork3;

/**
 * Created by alex323glo on 19.10.17.
 */
public class Constant implements Element {

    private int number;

    public Constant(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String show() {
        return String.valueOf(number);
    }
}
