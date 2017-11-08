package com.lab111.labwork8;

/**
 * Realisation of Composite graphic element with
 * prototype logic of simple cloning.
 *
 * @author alex323glo
 * @version 1.0.0
 *
 * @see Composite
 * @see GraphicElement
 * @see CloneableElement
 */
public class SimplyCloneableComposite extends Composite {
    /**
     * Gives copy of this object.
     *
     * @return copy of this object.
     */
    @Override
    public Object clone() {
        Composite cloned = new SimplyCloneableComposite();
        cloned.setGraphicElements(this.getGraphicElements());
        return cloned;
    }
}
