package com.lab111.labwork3.v2;

import java.util.List;

public interface Element {

    /**
    * Shows whole content of current element.
    * @return com.lab111.labwork3.v3.Element's content, represented as String.
    * */
    String show();

    /**
     * Adds element to current Composite element.
     * Not supported in Leaf elements!
     * @param element com.lab111.labwork3.v3.Element instance (Leaf or Composite), which
     *                we want to aggregate.
     * */
    void add(Element element);

    /**
     * Removes element from current Composite element by index in element list.
     * Not supported in Leaf elements!
     * @param index integer value - index of element (in element list), which
     *              we want to remove.
     * */
    void remove(int index);

    /**
     * Gives access to element list of current Composite element.
     * Not supported in Leaf elements!
     * @return list of aggregated (to current Composite element) elements.
     * @see List
     * */
    List<Element> getAll();
}
