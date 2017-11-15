package com.lab111.labwork6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by alex323glo on 15.11.17.
 */
public class IntegerContainer implements DataContainer<Integer> {
    private List<Integer> data;
    private Algorithm<Integer> sortAlgorithm;

    /**
     * Constructor.
     *
     * @param sortAlgorithm needed sort tool (algorithm).
     * */
    public IntegerContainer(Algorithm<Integer> sortAlgorithm) {
        data = new ArrayList<>();
        this.sortAlgorithm = sortAlgorithm;
    }

    /**
     * Getter of sortAlgorithm field.
     *
     * @return field value;
     *
     * @see Algorithm
     * */
    public Algorithm<Integer> getSortAlgorithm() {
        return sortAlgorithm;
    }

    /**
     * Setter of sortAlgorithm field.
     *
     * @param sortAlgorithm initial value;
     *
     * @see Algorithm
     * */
    public void setSortAlgorithm(Algorithm<Integer> sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    /**
     * Adds new element to container.
     *
     * @param element data, which will be added.
     */
    @Override
    public void put(Integer element) {
        data.add(element);
    }

    /**
     * Gives access to element of container by integer
     * position index.
     *
     * @param index position of element in container.
     * @return needed element of container.
     */
    @Override
    public Integer get(int index) {
        return data.get(index);
    }

    /**
     * Removes element from container by integer
     * position index.
     *
     * @param index position of element in container.
     * @return removed element of container.
     */
    @Override
    public Integer remove(int index) {
        return data.remove(index);
    }

    /**
     * Gives access to container's elements with array.
     *
     * @return array of refs to container's elements.
     */
    @Override
    public Integer[] toArray() {
        Integer[] result = new Integer[data.size()];
        return data.toArray(result);
    }

    /**
     * Sorts current data container.
     */
    @Override
    public void sort() {
        data = new ArrayList<>(
                Arrays.asList(sortAlgorithm.sort(this.toArray()))
        );
    }
}
