package io.patterns.builder.iterator;

import io.patterns.builder.builder.VacationBuilder;
import io.patterns.builder.event.Event;

import java.util.Iterator;
import java.util.Stack;

public class EventIterator<T> implements Iterator<Event> {
    private final Stack<Iterator<Event>> eventIterators;
    private Event lastElement = null;

    public EventIterator(VacationBuilder builder) {
        this.eventIterators = new Stack<>();
        this.eventIterators.push(builder.getRoot().toIterator());
    }

    @Override
    public Event next() {
        traverseUntilNullIterator();
        popEmptyIterator();
        return lastElement;
    }

    private void popEmptyIterator() {
        if (!hasAnotherElement() && !eventIterators.empty()) {
            eventIterators.pop();
        }
        if (eventIterators.empty()) {
            lastElement = null;
        }
    }

    @Override
    public boolean hasNext() {
        popEmptyIterator();
        return hasAnotherElement();
    }

    private boolean hasAnotherElement() {
        return !eventIterators.empty() && eventIterators.lastElement().hasNext();
    }

    private void traverseUntilNullIterator() {
        while (hasAnotherElement()) {
            lastElement = eventIterators.lastElement().next();
            eventIterators.push(lastElement.toIterator());
        }
    }

    public Stack<Iterator<Event>> getStack() {
        return this.eventIterators;
    }
}
