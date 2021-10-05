package io.patterns.multiple.decorators;

import io.patterns.multiple.duck.Duck;
import io.patterns.multiple.observer.Observable;
import io.patterns.multiple.observer.QuackingObserver;

public class DuckCounter implements Duck {
    private final Duck duck;
    private static int quacks;
    private final Observable observable;

    public DuckCounter(Duck duck) {
        this.duck = duck;
        observable = new Observable(this);
    }

    @Override
    public String quack() {
        quacks += 1;
        notifyObservers();
        return this.duck.quack();
    }

    @Override
    public void addObserver(QuackingObserver researcher) {
        observable.addObserver(researcher);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    public static int getQuacks() {
        return quacks;
    }

    public Duck getDuck() {
        return this.duck;
    }

    public static void reset() {
        quacks = 0;
    }
}
