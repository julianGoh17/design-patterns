package io.patterns.multiple.observer;

public interface ObservableDuck {
    void addObserver(QuackingObserver researcher);

    void notifyObservers();
}
