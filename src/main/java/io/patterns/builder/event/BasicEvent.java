package io.patterns.builder.event;

import io.patterns.composite.iterators.NullIterator;
import io.patterns.iterator.Iterator;

public class BasicEvent extends Event {
    public BasicEvent(String name) {
        super(name);
    }

    @Override
    public Iterator<Event> toIterator() {
        return new NullIterator<>();
    }
}
