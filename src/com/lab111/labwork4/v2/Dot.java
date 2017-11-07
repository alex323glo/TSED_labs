package com.lab111.labwork4.v2;

import java.awt.*;

/**
 * Created by alex323glo on 02.11.17.
 */
public class Dot implements RastrImage {
    private int x;
    private int y;
    private Color color;

    public Dot() {
    }

    public Dot(Color color) {
        this.color = color;
    }

    public Dot(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Dot {x:" + x + ", y:" + y + ", color:" + color.toString() + "}");
    }
}
