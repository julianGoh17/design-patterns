package io.patterns.composite;

import io.patterns.iterator.Iterator;

public abstract class MenuComponent {

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public double getCost() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException();
    }

    public void add(MenuComponent item) {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getItemAt(int i) {
        throw new UnsupportedOperationException();
    }

    public Iterator<MenuComponent> toIterator() {
        throw new UnsupportedOperationException();
    }
}
