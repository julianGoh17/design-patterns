package io.patterns.multiple.observer;

import java.util.ArrayList;
import java.util.List;

public class Observable implements ObservableDuck {
    private final List<QuackingObserver> observers = new ArrayList<>();
    private final ObservableDuck duck;

    public Observable(ObservableDuck duck) {
        this.duck = duck;
    }

    @Override
    public void addObserver(QuackingObserver researcher) {
        observers.add(researcher);
    }

    public List<QuackingObserver> getObservers() {
        return observers;
    }

    @Override
    public void notifyObservers() {
        for (QuackingObserver observer : observers) {
            observer.update(duck);
        }
    }
}
