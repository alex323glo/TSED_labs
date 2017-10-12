package com.lab111.labwork2;

/**
 * This class is an implementation of interface I1. Also it extends logic from class C2
 * and aggregates I1 interface and C2 class.
 * @author Alexey O.
 * @version 1.0
 * @see I1
 * @see C2
 * */
public class C1 extends C2 implements I1 {
    I1 i1;
    I2 i2;

    /**
     * Realisation of meth1() logic from I1 interface, which prints
     * to console name of current class (C1) and name of method (meth1()).
     * @see I1
     * @see I1#meth1()
     * */
    @Override
    public void meth1() {
        System.out.println("Class: C1, method: meth1()");
    }

    /**
     * Realisation of meth3() logic from I3 interface, which prints
     * to console name of current class (C1) and name of method (meth3()).
     * @see I1
     * @see I3#meth3()
     * */
    @Override
    public void meth3() {
        System.out.println("Class: C1, method: meth3()");
    }
}
