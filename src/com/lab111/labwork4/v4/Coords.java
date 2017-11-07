package com.lab111.labwork4.v4;

/**
 * Class of coordinates (X and Y) of Dot. Stands for
 * outer state of flyweight Dot.
 * @author alex323glo
 * @version 1.0.0
 * @see FlyweightDot
 */
public class Coords {
    private int x;
    private int y;

    /**
     * Constructor. Assigns x and y fields.
     * @param x initial value.
     * @param y initial value.
     * */
    public Coords(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Getter of x field.
     * @return field value.
     * */
    public int getX() {
        return x;
    }

    /**
     * Setter of x field.
     * @param x initial value.
     * */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Getter of y field.
     * @return field value.
     * */
    public int getY() {
        return y;
    }

    /**
     * Setter of y field.
     * @param y initial value.
     * */
    public void setY(int y) {
        this.y = y;
    }
}
