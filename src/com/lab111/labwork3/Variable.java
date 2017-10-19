package com.lab111.labwork3;

/**
 * Created by alex323glo on 19.10.17.
 */
public class Variable implements Element {

    private String name;

    public Variable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String show() {
        return name;
    }
}
