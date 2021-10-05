package io.patterns.multiple.iterator;

import io.patterns.multiple.duck.Duck;
import io.patterns.multiple.observer.ObservableDuck;
import io.patterns.multiple.observer.QuackingObserver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flock implements Duck {
    private final List<Duck> ducks = new ArrayList<>();

    public List<Duck> getDucks() {
        return ducks;
    }

    public void add(Duck duck) {
        this.ducks.add(duck);
    }

    @Override
    public String quack() {
        Iterator<Duck> iterator = toIterator();
        while (iterator.hasNext()) {
            iterator.next().quack();
        }
        return "Flock";
    }

    @Override
    public void addObserver(QuackingObserver researcher) {
        ducks.forEach(duck -> duck.addObserver(researcher));
    }

    @Override
    public void notifyObservers() {
        ducks.forEach(ObservableDuck::notifyObservers);
    }

    public Iterator<Duck> toIterator() {
        return ducks.iterator();
    }
}
