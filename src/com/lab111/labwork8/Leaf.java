package com.lab111.labwork8;

/**
 * Leaf graphic object class, which implements
 * logic of GraphicObject interface and has abstract logic of prototype.
 *
 * @author alex323glo
 * @version 1.0.0
 *
 * @see GraphicElement
 * @see CloneableElement
 */
public abstract class Leaf implements GraphicElement {

    private String type;

    /**
     * Getter of type field.
     *
     * @return value of field.
     * */
    public String getType() {
        return type;
    }

    /**
     * Setter of type field.
     *
     * @param type initial value.
     * */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Shows graphic object as text.
     *
     * @return this graphic object data as String text.
     */
    @Override
    public String show() {
        return "Leaf(" + this.hashCode() + ") {" + type + "}";
    }

    /**
     * Gives copy of this object.
     *
     * @return copy of this object.
     */
    @Override
    public abstract Object clone();
}
