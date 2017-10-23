package com.lab111.labwork3.v1;

/**
 * Realisation of operation sign (Leaf). Supports Element interface.
 * @author Alexey O.
 * @version 1.0
 *
 * @see Element
 * */
public class OperationSign implements Element {

    private Sign sign;

    /**
     * Empty constructor.
     * */
    public OperationSign() {
    }

    /**
     * Constructor, which assigns sign field.
     * @see Sign
     * */
    public OperationSign(Sign sign) {
        this.sign = sign;
    }

    /**
     * Getter of sign field.
     * @see Sign
     * */
    public Sign getSign() {
        return sign;
    }

    /**
     * Setter of sign field.
     * @see Sign
     * */
    public void setSign(Sign sign) {
        this.sign = sign;
    }

    /**
     * Realisation of show() method, implemented from Element interface.
     * @return String version of sign field.
     * @see Element
     * @see Sign
     * */
    @Override
    public String show() {
        return "OperationSign: " + sign.toString();
    }
}
