package io.patterns.builder.builder;

import io.patterns.builder.event.Event;

public interface Builder {
    Event getRoot();

    Builder withComponent(String name);

    Builder endComponent();

    Builder addEvent(Event event);

    Event end();
}
