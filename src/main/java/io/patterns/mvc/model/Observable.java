package io.patterns.mvc.model;

import io.patterns.mvc.view.Observer;

import java.util.List;

public interface Observable {
    List<Observer> getObservers();

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
