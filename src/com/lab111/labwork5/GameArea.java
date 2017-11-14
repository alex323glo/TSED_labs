package com.lab111.labwork5;

import java.util.ArrayList;
import java.util.List;

// TODO add doc.
/**
 * Created by alex323glo on 14.11.17.
 */
public class GameArea implements GameObservable {

    private List<GameObserver> observers;

    public GameArea() {
        observers = new ArrayList<>();
    }

    public void shoot(String coords) {
        notifyObservers(coords, "dead");
    }

    @Override
    public void addObserver(GameObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(GameObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message, String newState) {
        System.out.println("Game observer: " + message + " -> " + newState);
        for (GameObserver observer: observers) {
            observer.updateState(message, newState);
        }
    }
}
