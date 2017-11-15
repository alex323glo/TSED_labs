package com.lab111.labwork5;

/**
 * General interface for observer (subscriber).
 *
 * @author alex323glo
 * @version 1.0.0
 *
 * @see GameObservable
 * */
public interface GameObserver {

    /**
     * Updates state of this observer.
     *
     * @param message notification message, which is used to delegate
     *                change of state.
     * @param newState initial value of new state of this observer.
     * */
    void updateState(String message, String newState);

}
