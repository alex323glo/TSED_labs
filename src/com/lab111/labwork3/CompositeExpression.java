package com.lab111.labwork3;

/**
 * Composite expression, which aggregates Expression class and OperationSign.
 * Realisation of Expression interface.
 * @author Alexey O.
 * @version 3.0
 */
public class CompositeExpression implements Expression {
    private Expression expression1;
    private Expression expression2;
    private OperationSign operationSign;

    /**
     * Getter of expression1 field.
     *
     * @return expression1 field value.
     * */
    public Expression getExpression1() {
        return expression1;
    }

    /**
     * Setter of expression1 field.
     *
     * @param expression1 initial value.
     * */
    public void setExpression1(Expression expression1) {
        this.expression1 = expression1;
    }

    /**
     * Getter of expression2 field.
     *
     * @return expression2 field value.
     * */
    public Expression getExpression2() {
        return expression2;
    }

    /**
     * Setter of expression2 field.
     *
     * @param expression2 initial value.
     * */
    public void setExpression2(Expression expression2) {
        this.expression2 = expression2;
    }

    /**
     * Getter of operationSign field.
     *
     * @return operationSign field value.
     * */
    public OperationSign getOperationSign() {
        return operationSign;
    }

    /**
     * Setter of operationSign field.
     *
     * @param operationSign initial value.
     * */
    public void setOperationSign(OperationSign operationSign) {
        this.operationSign = operationSign;
    }

    /**
     * Shows all content of expression.
     *
     * @return content of expression, represented as String.
     */
    @Override
    public String show() {
        return "(" + expression1.show() + " " + operationSign.toString() + " " + expression2.show() + ")";
    }
}
