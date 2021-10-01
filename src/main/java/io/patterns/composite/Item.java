package io.patterns.composite;

import io.patterns.composite.iterators.NullIterator;
import io.patterns.iterator.Iterator;

public class Item extends MenuComponent {
    private final String name;
    private final double cost;

    public Item(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return String.format("%s: $%.2f", name, cost);
    }

    @Override
    public Iterator<MenuComponent> toIterator() {
        return new NullIterator<>();
    }
}
