package io.patterns.observer.subject;

import io.patterns.observer.observer.Observer;

public interface Subject {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
