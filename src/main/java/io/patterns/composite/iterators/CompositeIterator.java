package io.patterns.composite.iterators;

import io.patterns.composite.MenuComponent;
import io.patterns.iterator.Iterator;

import java.util.List;

public class CompositeIterator implements Iterator<MenuComponent> {
    private final List<MenuComponent> components;
    private int index;

    public CompositeIterator(List<MenuComponent> components) {
        this.components = components;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < components.size();
    }

    @Override
    public MenuComponent next() {
        if (hasNext()) {
            MenuComponent item = components.get(index);
            this.index += 1;
            return item;
        }
        return null;
    }
}
