package com.lab111.labwork3.v1;

/**
 * Realisation of composite expression (Composite). Supports Element interface.
 * Aggregates SimpleExpression (Composite) and OperationSign (Leaf) classes.
 * @author Alexey O.
 * @version 1.0
 *
 * @see Element
 * @see SimpleExpression
 * @see OperationSign
 * */
public class CompositeExpression implements Element {

    private SimpleExpression firstExpression;
    private SimpleExpression secondExpression;
    private OperationSign operationSign;

    /**
     * Empty constructor.
     * */
    public CompositeExpression() {

    }

    /**
     * Constructor, which assigns both simple expressions and operation sign between them.
     * @see SimpleExpression
     * @see OperationSign
     * */
    public CompositeExpression(SimpleExpression firstExpression, SimpleExpression secondExpression, OperationSign operationSign) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
        this.operationSign = operationSign;
    }

    /**
     * Getter of first SimpleExpression.
     * @see SimpleExpression
     * */
    public SimpleExpression getFirstExpression() {
        return firstExpression;
    }

    /**
     * Setter of first SimpleExpression.
     * @see SimpleExpression
     * */
    public void setFirstExpression(SimpleExpression firstExpression) {
        this.firstExpression = firstExpression;
    }

    /**
     * Getter of second SimpleExpression.
     * @see SimpleExpression
     * */
    public SimpleExpression getSecondExpression() {
        return secondExpression;
    }

    /**
     * Setter of second SimpleExpression.
     * @see SimpleExpression
     * */
    public void setSecondExpression(SimpleExpression secondExpression) {
        this.secondExpression = secondExpression;
    }

    /**
     * Getter of operation sign.
     * @see OperationSign
     * */
    public OperationSign getOperationSign() {
        return operationSign;
    }

    /**
     * Setter of operation sign.
     * @see OperationSign
     * */
    public void setOperationSign(OperationSign operationSign) {
        this.operationSign = operationSign;
    }

    /**
     * Realisation of show() method, implemented from Element interface.
     * @return String, which contains substrings - results of calling show() method
     * of aggregated classes (OperationSign and SimpleExpression).
     * @see Element
     * @see SimpleExpression
     * @see OperationSign
     * */
    @Override
    public String show() {
        return "CompositeExpression: {" +
                firstExpression.show() + " " +
                operationSign.show() + " " +
                secondExpression.show() +
                "}";
    }
}
