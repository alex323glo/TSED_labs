package com.lab111.labwork9;

/**
 * Abstract factory of object readers and writers.
 *
 * @author alex323glo
 * @version 1.0.0
 */
public abstract class WebService {

    /**
     * Creates instance of abstract Reader.
     *
     * @return created instance.
     *
     * @see Reader
     * */
    public abstract Reader createReader();

    /**
     * Creates instance of abstract Writer.
     *
     * @return created instance.
     *
     * @see Writer
     * */
    public abstract Writer createWriter();

}
