package com.lab111.labwork3.v1;

/**
 * Realisation of variable element (Leaf). Supports Element interface.
 * @author Alexey O.
 * @version 1.0
 *
 * @see Element
 * */
public class Variable implements Element {

    private String name;

    /**
     * Empty constructor.
     * */
    public Variable() {
    }

    /**
     * Constructor, which assigns name field.
     * */
    public Variable(String name) {
        this.name = name;
    }

    /**
     * Getter of name field.
     * */
    public String getName() {
        return name;
    }

    /**
     * Setter of name field.
     * */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Realisation of show() method, implemented from Element interface.
     * @return name field.
     * @see Element
     * */
    @Override
    public String show() {
        return "Variable: " + name;
    }
}
