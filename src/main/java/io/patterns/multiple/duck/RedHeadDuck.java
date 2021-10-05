package io.patterns.multiple.duck;

import io.patterns.multiple.observer.Observable;
import io.patterns.multiple.observer.QuackingObserver;

public class RedHeadDuck implements Duck {
    private final Observable observable;

    public RedHeadDuck() {
        this.observable = new Observable(this);
    }

    @Override
    public String quack() {
        notifyObservers();
        return "Kwak";
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
