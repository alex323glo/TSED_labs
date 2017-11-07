package com.lab111.labwork8;

/**
 * Created by alex323glo on 07.11.17.
 */
public class DeeplyCloneableLeaf extends Leaf {

    public DeeplyCloneableLeaf() {
    }

    public DeeplyCloneableLeaf(String type) {
        this.setType(type);
    }

    @Override
    public Object clone() {
        Leaf cloned = new DeeplyCloneableLeaf();
        cloned.setType(new String(this.getType()));
        return cloned;
    }
}
