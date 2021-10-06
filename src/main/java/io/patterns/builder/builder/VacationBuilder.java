package io.patterns.builder.builder;

import io.patterns.builder.event.Event;
import io.patterns.builder.event.NestedEvent;
import io.patterns.builder.iterator.EventIterator;

import java.util.Iterator;

public class VacationBuilder implements Builder {
    private final Event root = new NestedEvent("Vacation");
    private NestedEvent day = null;

    @Override
    public Event getRoot() {
        return root;
    }

    @Override
    public Builder withComponent(String name) {
        this.day = new NestedEvent(name);
        return this;
    }

    @Override
    public Builder endComponent() {
        if (day != null) {
            root.addEvent(day);
        }
        return this;
    }

    @Override
    public Builder addEvent(Event event) {
        this.day.addEvent(event);
        return this;
    }

    @Override
    public Event end() {
        return root;
    }

    public Iterator<Event> getEventIterator() {
        return new EventIterator<>(this);
    }

    public Iterator<Event> getRootIterator() {
        return root.toIterator();
    }
}
