package com.lab111.labwork2;

/**
 * This class is an implementation of interface I2. Also it aggregates C3 class.
 * @author Alexey O.
 * @version 1.0
 * @see I2
 * */
public class C2 implements I2 {

    public C3 c3;

    /**
     * Realisation of meth2() logic from I2 interface, which prints
     * to console name of current class (C2) and name of method (meth2()).
     * @see I2
     * @see I2#meth2()
     * */
    @Override
    public void meth2() {
        System.out.println("Class: C2, method: meth2()");
    }

}
