package com.lab111.labwork8;

/**
 * Created by alex323glo on 07.11.17.
 */
public abstract class Leaf implements GraphicElement {

    private static int leafCounter = 0;
    private int leafNumber;

    private String type;

    public Leaf() {
        leafNumber = leafCounter++;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String show() {
        return "Leaf(" + leafNumber + ") {" + type + "}";
    }

    @Override
    public abstract Object clone();
}
