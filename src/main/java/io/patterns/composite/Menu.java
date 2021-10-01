package io.patterns.composite;

import io.patterns.composite.iterators.CompositeIterator;
import io.patterns.iterator.Iterator;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {
    private final String name;
    private final List<MenuComponent> components;

    public Menu(String name) {
        this.name = name;
        this.components = new ArrayList<>();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void add(MenuComponent item) {
        components.add(item);
    }

    @Override
    public MenuComponent getItemAt(int i) {
        if (i >= 0 && i < components.size()) {
            return components.get(i);
        }
        return null;
    }

    @Override
    public Iterator<MenuComponent> toIterator() {
        return new CompositeIterator(components);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(getName()).append("\n");
        Iterator<MenuComponent> components = toIterator();
        while(components.hasNext()) {
            MenuComponent component = components.next();
            res.append(component.toString()).append("\n");
        }
        res = new StringBuilder(res.substring(0, res.length() - 1));
        return res.toString();
    }
}
