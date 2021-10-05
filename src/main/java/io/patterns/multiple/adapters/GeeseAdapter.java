package io.patterns.multiple.adapters;

import io.patterns.multiple.duck.Duck;
import io.patterns.multiple.observer.Observable;
import io.patterns.multiple.observer.QuackingObserver;

public class GeeseAdapter implements Duck {
    private final Geese geese;
    private final Observable observable;

    public GeeseAdapter(Geese geese) {
        this.geese = geese;
        this.observable = new Observable(this);
    }

    @Override
    public String quack() {
        notifyObservers();
        return this.geese.honk();
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
