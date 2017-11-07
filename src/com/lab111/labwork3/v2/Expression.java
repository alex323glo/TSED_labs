package com.lab111.labwork3.v2;

import java.util.ArrayList;
import java.util.List;

/**
 * Realisation of composite expression (Composite). Supports com.lab111.labwork3.v3.Element interface.
 * Aggregates com.lab111.labwork3.v3.Element class.
 * @author Alexey O.
 * @version 1.0
 *
 * @see Element
 * */
public class Expression implements Element {
    private List<Element> components;

    /**
     * Constructor, which assigns components field
     * with default value.
     * */
    public Expression() {
        components = new ArrayList<>();
    }

    /**
     * Shows whole content of current element.
     *
     * @return com.lab111.labwork3.v3.Element's content, represented as String.
     */
    @Override
    public String show() {
        System.out.println("com.lab111.labwork3.v3.Expression: show()");
        StringBuilder result = new StringBuilder();
        for (Element element: components) {
            result.append(element.show()).append(" ");
        }
        return result.toString();
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
        components.add(element);
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
        components.remove(index);
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
        return components;
    }
}
