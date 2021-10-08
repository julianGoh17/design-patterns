package io.patterns.builder.event;

import java.util.Iterator;

public class NestedEvent extends Event {
    public NestedEvent(String eventName) {
        super(eventName);
    }

    @Override
    public Iterator<Event> toIterator() {
        return events.iterator();
    }

    @Override
    public void addEvent(Event event) {
        events.add(event);
    }

    @Override
    public int getNumberOfDirectChildEvents() {
        return events.size();
    }
}
