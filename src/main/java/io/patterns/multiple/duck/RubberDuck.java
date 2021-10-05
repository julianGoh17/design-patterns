package io.patterns.multiple.duck;

import io.patterns.multiple.observer.Observable;
import io.patterns.multiple.observer.QuackingObserver;

public class RubberDuck implements Duck {
    private final Observable observable;

    public RubberDuck() {
        this.observable = new Observable(this);
    }

    @Override
    public String quack() {
        notifyObservers();
        return "Squeak";
    }

    @Override
    public void addObserver(QuackingObserver researcher) {
        observable.addObserver(researcher);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
