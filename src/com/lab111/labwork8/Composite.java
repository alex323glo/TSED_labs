package com.lab111.labwork8;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite graphic object class, which implements
 * logic of GraphicObject interface and has abstract logic of prototype.
 *
 * @author alex323glo
 * @version 1.0.0
 *
 * @see GraphicElement
 * @see CloneableElement
 */
public abstract class Composite implements GraphicElement {

    private static int compositeCounter = 0;
    private int compositeNumber;

    private List<GraphicElement> graphicElements;

    /**
     * Default constructor override.
     * Assigns graphicElements List and increments
     * Composite class objects static counter.
     * */
    public Composite() {
        graphicElements = new ArrayList<>();
        compositeNumber = compositeCounter++;
    }

    /**
     * Getter of graphicElements field.
     *
     * @return value of field.
     *
     * @see List
     * @see GraphicElement
     * */
    public List<GraphicElement> getGraphicElements() {
        return graphicElements;
    }

    /**
     * Setter of graphicElements field.
     *
     * @param graphicElements initial value.
     *
     * @see List
     * @see GraphicElement
     * */
    public void setGraphicElements(List<GraphicElement> graphicElements) {
        this.graphicElements = graphicElements;
    }

    /**
     * Adds aggregated element.
     *
     * @param element ref to new aggregated element.
     *
     * @see GraphicElement
     * */
    public void addElement(GraphicElement element) {
        graphicElements.add(element);
    }

    /**
     * Removes aggregated element.
     *
     * @param index position of element in List.
     * @return removed element.
     *
     * @see GraphicElement
     * */
    public GraphicElement removeElement(int index) {
        return graphicElements.remove(index);
    }

    /**
     * Shows graphic object as text.
     *
     * @return this graphic object data as String text.
     */
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

    /**
     * Gives copy of this object.
     *
     * @return copy of this object.
     */
    @Override
    public abstract Object clone();
}
