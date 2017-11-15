package com.lab111.labwork5;

/**
 * General interface for subject of observation.
 *
 * @author alex323glo
 * @version 1.0.0
 *
 * @see GameObserver
 * */
public interface GameObservable {

    /**
     * Subscribes observer to this subject.
     *
     * @param observer reference to subscriber object.
     *
     * @see GameObserver
     * */
    void addObserver(GameObserver observer);

    /**
     * Unsubscribes observer from this subject.
     *
     * @param observer reference to subscriber object.
     *
     * @see GameObserver
     * */
    void removeObserver(GameObserver observer);

    /**
     * Sends notification to all subscribers.
     *
     * @param message notification message.
     *
     * @param newState initial value of new state of subscriber.
     * */
    void notifyObservers(String message, String newState);
}
