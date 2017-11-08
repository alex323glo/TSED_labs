package com.lab111.labwork8;

/**
 * General interface for graphic elements.
 * Extends logic of CloneableElement (prototype) interface.
 *
 * @author alex323glo
 * @version 1.0.0
 *
 * @see CloneableElement
 * */
public interface GraphicElement extends CloneableElement {

    /**
     * Shows graphic object as text.
     *
     * @return this graphic object data as String text.
     * */
    String show();
}
