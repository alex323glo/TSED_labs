package com.lab111.labwork8;

/**
 * Realisation of Leaf graphic element with
 * prototype logic of simple cloning.
 *
 * @author alex323glo
 * @version 1.0.0
 *
 * @see Leaf
 * @see GraphicElement
 * @see CloneableElement
 */
public class SimplyCloneableLeaf extends Leaf {

    /**
     * Default constructor.
     * */
    public SimplyCloneableLeaf() {
    }

    /**
     * Constructor, which assigns type field (parent field).
     *
     * @param type initial value.
     *
     * @see Leaf
     * @see Leaf#type
     * */
    public SimplyCloneableLeaf(String type) {
        this.setType(type);
    }

    /**
     * Gives copy of this object.
     *
     * @return copy of this object.
     */
    @Override
    public Object clone() {
        Leaf cloned = new SimplyCloneableLeaf();
        cloned.setType(this.getType());
        return cloned;
    }
}
