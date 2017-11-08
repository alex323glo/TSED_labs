package com.lab111.labwork8;

/**
 * Realisation of Leaf graphic element with
 * prototype logic of deep cloning.
 *
 * @author alex323glo
 * @version 1.0.0
 *
 * @see Leaf
 * @see GraphicElement
 * @see CloneableElement
 */
public class DeeplyCloneableLeaf extends Leaf {

    /**
     * Default constructor.
     * */
    public DeeplyCloneableLeaf() {
    }

    /**
     * Constructor, which assigns type field (parent field).
     *
     * @param type initial value.
     *
     * @see Leaf
     * @see Leaf#type
     * */
    public DeeplyCloneableLeaf(String type) {
        this.setType(type);
    }

    /**
     * Gives copy of this object.
     *
     * @return copy of this object.
     */
    @Override
    public Object clone() {
        Leaf cloned = new DeeplyCloneableLeaf();
        cloned.setType(new String(this.getType()));
        return cloned;
    }
}
