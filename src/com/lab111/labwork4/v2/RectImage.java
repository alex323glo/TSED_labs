package com.lab111.labwork4.v2;

import java.util.List;

/**
 * Created by alex323glo on 02.11.17.
 */
public class RectImage implements RastrImage {
    private List<Dot> dots;

    public RectImage() {
    }

    public RectImage(List<Dot> dots) {
        this.dots = dots;
    }

    public List<Dot> getDots() {
        return dots;
    }

    public void setDots(List<Dot> dots) {
        this.dots = dots;
    }

    public RectImage addDot(int x, int y, Dot dot) {
        dot.setX(x);
        dot.setY(y);
        dots.add(dot);
        return this;
    }

    @Override
    public void draw() {
        System.out.println("RectImage {");
        for (Dot dot: dots) {
            System.out.print("  ");
            dot.draw();
        }
        System.out.println("}");
    }
}
