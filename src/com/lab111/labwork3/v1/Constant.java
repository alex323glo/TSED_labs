package com.lab111.labwork3.v1;

/**
 * Realisation of constant element (Leaf). Supports com.lab111.labwork3.v3.Element interface.
 * @author Alexey O.
 * @version 1.0
 *
 * @see Element
 * */
public class Constant implements Element {

    private int number;

    /**
     * Empty constructor.
     * */
    public Constant() {

    }

    /**
     * Constructor, which assigns number field.
     * */
    public Constant(int number) {
        this.number = number;
    }

    /**
     * Getter of number field.
     * */
    public int getNumber() {
        return number;
    }

    /**
     * Setter of number field.
     * */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * Realisation of show() method, implemented from com.lab111.labwork3.v3.Element interface.
     * @return String version of number field.
     * @see Element
     * */
    @Override
    public String show() {
        return "Constant: " + String.valueOf(number);
    }
}
