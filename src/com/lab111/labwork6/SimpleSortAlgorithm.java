package com.lab111.labwork6;

import java.util.Arrays;

/**
 * Realisation of sort tool interface (Algorithm interface) based on
 * simple sort algorithm. Supports parametrization of sorted data.
 *
 * @author alex323glo
 * @version 1.0.0
 *
 * @see Algorithm
 * @see Comparable
 */
public class SimpleSortAlgorithm<T extends Comparable<T>> implements Algorithm<T> {
    /**
     * Sorts proposed data.
     *
     * @param data data, which will be sorted, as array.
     * @return sorted data as array.
     */
    @Override
    public T[] sort(T[] data) {
        System.out.println(" * SimpleSortAlgorithm<" + data[0].getClass().getSimpleName() + ">: sort()");
        Arrays.sort(data);
        return data;
    }
}
