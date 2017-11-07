package com.lab111.labwork8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alex323glo on 07.11.17.
 */
public abstract class Composite implements GraphicElement {

    private static int compositeCounter = 0;
    private int compositeNumber;

    private List<GraphicElement> graphicElements;

    public Composite() {
        graphicElements = new ArrayList<>();
        compositeNumber = compositeCounter++;
    }

    public List<GraphicElement> getGraphicElements() {
        return graphicElements;
    }

    public void setGraphicElements(List<GraphicElement> graphicElements) {
        this.graphicElements = graphicElements;
    }

    public void addElement(GraphicElement element) {
        graphicElements.add(element);
    }

    public GraphicElement removeElement(int index) {
        return graphicElements.remove(index);
    }

    @Override
    public String show() {
        StringBuilder stringBuilder = new StringBuilder("Composite(" + compositeNumber + ") {");
        for (int i = 0; i < graphicElements.size(); i++) {
            stringBuilder.append(graphicElements.get(i).show());
            if (i < graphicElements.size() - 1) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    @Override
    public abstract Object clone();
}
