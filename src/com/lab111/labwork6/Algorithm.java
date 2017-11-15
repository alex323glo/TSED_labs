package com.lab111.labwork6;

/**
 * General interface for sort tool.
 * Supports parametrization of sorted data.
 *
 * @author alex323glo
 * @version 1.0.0
 *
 * @see Comparable
 * */
public interface Algorithm<T extends Comparable<T>> {

    /**
     * Sorts proposed data.
     *
     * @param data data, which will be sorted, as array.
     *
     * @return sorted data as array.
     * */
    T[] sort(T[] data);

}
