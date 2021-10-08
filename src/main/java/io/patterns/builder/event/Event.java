package io.patterns.builder.event;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Event {
    protected final String name;
    protected final List<Event> events = new ArrayList<>();

    public Event(String name) {
        this.name = name;
    }

    public final String getName() {
        return name;
    }

    public abstract Iterator<Event> toIterator();

    public void addEvent(Event event) {
        throw new UnsupportedOperationException();
    }

    public int getNumberOfDirectChildEvents() {
        throw new UnsupportedOperationException();
    }
}
