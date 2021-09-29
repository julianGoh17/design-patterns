package io.patterns.observer.vanilla.subject;

import io.patterns.observer.vanilla.observer.Observer;

public interface Subject {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
