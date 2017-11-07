package com.lab111.labwork3.v2;

import java.util.List;

/**
 * Realisation of variable element (Leaf). Supports com.lab111.labwork3.v3.Element interface.
 * @author Alexey O.
 * @version 1.0
 *
 * @see Element
 * */
public class Variable implements Element {
    private String name;

    /**
     * Constructor, which assigns name field.
     *
     * @param name value, which will be assigned.
     * */
    public Variable(String name) {
        this.name = name;
    }

    /**
     * Shows whole content of current element.
     *
     * @return com.lab111.labwork3.v3.Element's content, represented as String.
     */
    @Override
    public String show() {
        System.out.println("Variable: show()");
        return name;
    }

    /**
     * Adds element to current Composite element.
     * Not supported in Leaf elements!
     *
     * @param element com.lab111.labwork3.v3.Element instance (Leaf or Composite), which
     *                we want to aggregate.
     */
    @Override
    public void add(Element element) {
        throw new UnsupportedOperationException("Not supported in Leaf elements.");
    }

    /**
     * Removes element from current Composite element by index in element list.
     * Not supported in Leaf elements!
     *
     * @param index integer value - index of element (in element list), which
     *              we want to remove.
     */
    @Override
    public void remove(int index) {
        throw new UnsupportedOperationException("Not supported in Leaf elements.");
    }

    /**
     * Gives access to element list of current Composite element.
     * Not supported in Leaf elements!
     *
     * @return list of aggregated (to current Composite element) elements.
     * @see List
     */
    @Override
    public List<Element> getAll() {
        throw new UnsupportedOperationException("Not supported in Leaf elements.");
    }
}
