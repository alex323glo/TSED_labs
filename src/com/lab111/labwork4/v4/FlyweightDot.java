package com.lab111.labwork4.v4;

/**
 * Flyweight object class, used instead of heavy object.
 * Implements RastrImage interface logic.
 * @author alex323glo
 * @version 1.0.0
 * @see RastrImage
 */
public class FlyweightDot implements RastrImage {
    private Dot dot;
    private Coords coords;

    /**
     * Constructor.
     * @param dot inner state value.
     * @param coords outer state value.
     * @see Dot
     * @see Coords
     * */
    public FlyweightDot(Dot dot, Coords coords) {
        this.dot = dot;
        this.coords = coords;
    }

    /**
     * Getter of dot field.
     * @return dot field value.
     * @see Dot
     * */
    public Dot getDot() {
        return dot;
    }

    /**
     * Setter of dot field.
     * @param dot initial value.
     * @see Dot
     * */
    public void setDot(Dot dot) {
        this.dot = dot;
    }

    /**
     * Getter of coords field.
     * @return coords field value.
     * @see Dot
     * */
    public Coords getCoords() {
        return coords;
    }

    /**
     * Setter of coords field.
     * @param coords initial value.
     * @see Coords
     * */
    public void setCoords(Coords coords) {
        this.coords = coords;
    }

    /**
     * Shows Rastr Image (prints to console).
     * @see RastrImage
     * */
    @Override
    public void show() {
        dot.draw(coords.getX(), coords.getY());
    }
}
