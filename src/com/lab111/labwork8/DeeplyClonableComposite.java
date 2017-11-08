package com.lab111.labwork8;

/**
 * Realisation of Composite graphic element with
 * prototype logic of deep cloning.
 *
 * @author alex323glo
 * @version 1.0.0
 *
 * @see Composite
 * @see GraphicElement
 * @see CloneableElement
 */
public class DeeplyClonableComposite extends Composite {
    /**
     * Gives copy of this object.
     *
     * @return copy of this object.
     */
    @Override
    public Object clone() {
        Composite cloned = new DeeplyClonableComposite();
        for (GraphicElement element: this.getGraphicElements()) {
            cloned.getGraphicElements().add((GraphicElement) element.clone());
        }
        return cloned;
    }
}
