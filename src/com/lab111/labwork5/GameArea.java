package com.lab111.labwork5;

import java.util.ArrayList;
import java.util.List;

/**
 * Game area entity, which has logic of observation subject.
 * Aggregates observers (subscribers).
 *
 * @author alex323glo
 * @version 1.0.0
 *
 * @see GameObservable
 * */
public class GameArea implements GameObservable {

    private List<GameObserver> observers;

    /**
     * Constructor.
     * */
    public GameArea() {
        observers = new ArrayList<>();
    }

    /**
     * Business logic method, which describes shot action in game.
     *
     * @param coords position of target to shoot.
     * */
    public void shoot(String coords) {
        notifyObservers(coords, "dead");
    }

    /**
     * Subscribes observer to this subject.
     *
     * @param observer reference to subscriber object.
     * @see GameObserver
     */
    @Override
    public void addObserver(GameObserver observer) {
        observers.add(observer);
    }

    /**
     * Unsubscribes observer from this subject.
     *
     * @param observer reference to subscriber object.
     * @see GameObserver
     */
    @Override
    public void removeObserver(GameObserver observer) {
        observers.remove(observer);
    }

    /**
     * Sends notification to all subscribers.
     *
     * @param message  notification message.
     * @param newState initial value of new state of subscriber.
     */
    @Override
    public void notifyObservers(String message, String newState) {
        System.out.println("Game observer: " + message + " -> " + newState);
        for (GameObserver observer: observers) {
            observer.updateState(message, newState);
        }
    }
}
