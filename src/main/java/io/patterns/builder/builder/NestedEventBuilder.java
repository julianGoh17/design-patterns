package io.patterns.builder.builder;

import io.patterns.builder.event.Event;
import io.patterns.builder.event.NestedEvent;

public class NestedEventBuilder implements Builder {
    private Event root;

    @Override
    public Event getRoot() {
        return root;
    }

    @Override
    public Builder withComponent(String name) {
        root = new NestedEvent(name);
        return this;
    }

    @Override
    public Builder endComponent() {
        return this;
    }

    @Override
    public Builder addEvent(Event event) {
        this.root.addEvent(event);
        return this;
    }

    @Override
    public Event end() {
        return getRoot();
    }
}
