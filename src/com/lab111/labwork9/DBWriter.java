package com.lab111.labwork9;

/**
 * Concrete Writer entity of "Data Base" entities' group.
 * Extends abstract Writer.
 *
 * @author alex323glo
 * @version 1.0.0
 *
 * @see Writer
 */
public class DBWriter extends Writer {

    /**
     * Writes data using API of current entities' group.
     */
    @Override
    public void write() {
        System.out.println("DBWriter: write()");
    }
}
