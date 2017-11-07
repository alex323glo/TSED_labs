package com.lab111.labwork3.v1;

/**
 * Realisation of simple expression (Composite). Supports com.lab111.labwork3.v3.Element interface.
 * Aggregates com.lab111.labwork3.v3.Element class (Leaf).
 * @author Alexey O.
 * @version 1.0
 *
 * @see Element
 * */
public class SimpleExpression implements Element {

    private Element element;

    /**
     * Empty constructor.
     * */
    public SimpleExpression() {
    }

    /**
     * Constructor, which assigns element field.
     * @see Element
     * */
    public SimpleExpression(Element element) {
        this.element = element;
    }

    /**
     * Getter of element field.
     * @see Element
     * */
    public Element getElement() {
        return element;
    }

    /**
     * Setter of element field.
     * @see Element
     * */
    public void setElement(Element element) {
        this.element = element;
    }

    /**
     * Realisation of show() method, implemented from com.lab111.labwork3.v3.Element interface.
     * @return String, which contains substring - result of calling show() method
     * of aggregated class (com.lab111.labwork3.v3.Element).
     * @see Element
     * */
    @Override
    public String show() {
        return "SimpleExpression: {" + element.show() + "}";
    }
}
