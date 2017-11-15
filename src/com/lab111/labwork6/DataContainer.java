package com.lab111.labwork6;

public interface DataContainer<T extends Comparable<T>> {

    /**
     * Adds new element to container.
     *
     * @param element data, which will be added.
     * */
    void put(T element);

    /**
     * Gives access to element of container by integer
     * position index.
     *
     * @param index position of element in container.
     *
     * @return needed element of container.
     */
    T get(int index);

    /**
     * Removes element from container by integer
     * position index.
     *
     * @param index position of element in container.
     *
     * @return removed element of container.
     */
    T remove(int index);

    /**
     * Gives access to container's elements with array.
     *
     * @return array of refs to container's elements.
     */
    T[] toArray();

    /**
     * Sorts current data container.
     * */
    void sort();
}
