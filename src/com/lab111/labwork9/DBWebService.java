package com.lab111.labwork9;

/**
 * Concrete factory of "Data Base" entities' group.
 * Extends abstract factory of Readers and Writers (WebService).
 *
 * @author alex323glo
 * @version 1.0.0
 *
 * @see WebService
 */
public class DBWebService extends WebService {
    /**
     * Creates instance of Data Base Reader.
     *
     * @return created instance.
     *
     * @see DBReader
     */
    @Override
    public DBReader createReader() {
        return new DBReader();
    }

    /**
     * Creates instance of Data Base Writer.
     *
     * @return created instance.
     * @see DBWriter
     */
    @Override
    public DBWriter createWriter() {
        return new DBWriter();
    }
}
