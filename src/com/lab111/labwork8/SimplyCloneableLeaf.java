package com.lab111.labwork8;

/**
 * Created by alex323glo on 07.11.17.
 */
public class SimplyCloneableLeaf extends Leaf {

    public SimplyCloneableLeaf() {
    }

    public SimplyCloneableLeaf(String type) {
        this.setType(type);
    }

    @Override
    public Object clone() {
        Leaf cloned = new SimplyCloneableLeaf();
        cloned.setType(this.getType());
        return cloned;
    }
}
