package com.lab111.labwork4;

import java.awt.*;

/**
 * Class of Rastr Dot, which has color property.
 * Stands for inner (heavy) state of flyweight Dot.
 * @author alex323glo
 * @version 1.0.0
 * @see FlyweightDot
 * */
public class Dot {
    private Color color;

    /**
     * Constructor. Assigns color field.
     * @param color initial value.
     * @see Color
     * */
    public Dot(Color color) {
        this.color = color;
    }

    /**
     * Getter of color field.
     * @return field value.
     * @see Color
     * */
    public Color getColor() {
        return color;
    }

    /**
     * Setter of color field.
     * @param color initial value.
     * @see Color
     * */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * Draws (prints to console) dot by entered x and y coords (outer state).
     * @param x X coord value.
     * @param y Y coord value.
     * */
    public void draw(int x, int y) {
        System.out.println("Dot {x:" + x + ", y:" + y + ", color:" + color.toString() + "}");
    }
}
