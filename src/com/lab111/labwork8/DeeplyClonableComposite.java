package com.lab111.labwork8;

/**
 * Created by alex323glo on 07.11.17.
 */
public class DeeplyClonableComposite extends Composite {
    @Override
    public Object clone() {
        Composite cloned = new DeeplyClonableComposite();
        for (GraphicElement element: this.getGraphicElements()) {
            cloned.getGraphicElements().add((GraphicElement) element.clone());
        }
        return cloned;
    }
}
