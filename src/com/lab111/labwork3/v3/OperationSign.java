package com.lab111.labwork3.v3;

public enum OperationSign {

    PLUS, MINUS, MUL, DIV;

    /**
     * Returns the name of this enum constant, as contained in the
     * declaration.  This method may be overridden, though it typically
     * isn't necessary or desirable.  An enum type should override this
     * method when a more "programmer-friendly" string form exists.
     *
     * @return the name of this enum constant
     */
    @Override
    public String toString() {
        switch (this) {
            case PLUS:
                return  "+";
            case MINUS:
                return "-";
            case MUL:
                return "*";
            case DIV:
                return "/";

            default:
                return null;
        }
    }
}
