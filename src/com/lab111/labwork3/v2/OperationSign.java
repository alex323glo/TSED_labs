package com.lab111.labwork3.v2;

import java.util.List;

/**
 * Realisation of operationName sign (Leaf). Supports com.lab111.labwork3.v3.Element interface.
 * @author Alexey O.
 * @version 1.0
 *
 * @see Element
 * */
public class OperationSign implements Element {
    private String operationName;

    /**
     * Constructor, which assigns operationName field.
     *
     * @param operationName value, which will be assigned.
     * */
    public OperationSign(String operationName) {
        this.operationName = operationName;
    }

    /**
     * Shows whole content of current element.
     *
     * @return com.lab111.labwork3.v3.Element's content, represented as String.
     */
    @Override
    public String show() {
        System.out.println("OperationSign: show()");
        return operationName;
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
