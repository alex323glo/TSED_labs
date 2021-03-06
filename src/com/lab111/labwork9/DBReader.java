package com.lab111.labwork9;

/**
 * Concrete Reader entity of "Data Base" entities' group.
 * Extends abstract Reader.
 *
 * @author alex323glo
 * @version 1.0.0
 *
 * @see Reader
 */
public class DBReader extends Reader {

    /**
     * Reads data using API of current entities' group.
     */
    @Override
    public void read() {
        System.out.println("DBReader: read()");
    }
}
