package com.lab111.labwork4.v4;

import java.util.LinkedList;
import java.util.List;

/**
 * Rectangle image class, which aggregates flyweight Dots.
 * Implements logic of RastrImage interface.
 * @author alex323glo
 * @version 1.0.0
 * @see RastrImage
 * */
public class RectImage implements RastrImage {

    private List<FlyweightDot> flyweightDots;

    /**
     * Constructor. Assigns flyweightDots List.
     * */
    public RectImage() {
        flyweightDots = new LinkedList<>();
    }

    /**
     * Adds new flyweight Dot to flyweightDots List.
     * @param flyweightDot value, which will be added to List.
     * @return ref to current object (this).
     * @see FlyweightDot
     * */
    public RectImage addDot(FlyweightDot flyweightDot) {
        flyweightDots.add(flyweightDot);
        return this;
    }

    /**
     * Shows Rastr Image (prints to console).
     * @see RastrImage
     * */
    @Override
    public void show() {
        System.out.println("RectImage {");
        for (FlyweightDot dot: flyweightDots) {
            System.out.print("\t");
            dot.show();
        }
        System.out.println("}");
    }
}
