package com.lab111.labwork9;

/**
 * Concrete factory of "File" entities' group.
 * Extends abstract factory of Readers and Writers (WebService).
 *
 * @author alex323glo
 * @version 1.0.0
 *
 * @see WebService
 */
public class FileWebService extends WebService {
    /**
     * Creates instance of File Reader.
     *
     * @return created instance.
     *
     * @see FileReader
     */
    @Override
    public FileReader createReader() {
        return new FileReader();
    }

    /**
     * Creates instance of File Writer.
     *
     * @return created instance.
     *
     * @see FileWriter
     */
    @Override
    public FileWriter createWriter() {
        return new FileWriter();
    }
}
