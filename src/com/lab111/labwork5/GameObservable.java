package com.lab111.labwork5;

// TODO add doc.
public interface GameObservable {

    void addObserver(GameObserver observer);

    void removeObserver(GameObserver observer);

    void notifyObservers(String message, String newState);

}
