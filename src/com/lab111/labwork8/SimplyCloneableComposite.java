package com.lab111.labwork8;

/**
 * Created by alex323glo on 07.11.17.
 */
public class SimplyCloneableComposite extends Composite {
    @Override
    public Object clone() {
        Composite cloned = new SimplyCloneableComposite();
        cloned.setGraphicElements(this.getGraphicElements());
        return cloned;
    }
}
