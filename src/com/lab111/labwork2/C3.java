package com.lab111.labwork2;

/**
 * This class is an implementation of interface I3.
 * @author Alexey O.
 * @version 1.0
 * @see I3
 * */
public class C3 implements I3 {

    /**
     * Realisation of meth3() logic from I3 interface, which prints
     * to console name of current class (C3) and name of method (meth3()).
     * @see I3
     * @see I3#meth3()
     * */
    @Override
    public void meth3() {
        System.out.println("Class: C3, method: meth3()");
    }

    /**
     * Realisation of meth2() logic from I2 interface, which prints
     * to console name of current class (C3) and name of method (meth2()).
     * @see I2
     * @see I2#meth2()
     * */
    @Override
    public void meth2() {
        System.out.println("Class: C3, method: meth2()");
    }
}
