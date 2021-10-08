package io.patterns.builder;

import io.patterns.builder.builder.Builder;
import io.patterns.builder.builder.NestedEventBuilder;
import io.patterns.builder.event.BasicEvent;
import io.patterns.builder.event.Event;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

public class NestedEventBuilderTest {
    @Test
    public void TestInitialization() {
        Builder builder = new NestedEventBuilder();
        Assert.assertNull(builder.getRoot());
    }

    @Test
    public void TestWithComponent() {
        Builder builder = new NestedEventBuilder();
        Assert.assertEquals(builder, builder.withComponent("event"));
        Assert.assertEquals("event", builder.getRoot().getName());
        Assert.assertFalse(builder.getRoot().toIterator().hasNext());
    }

    @Test
    public void TestEndDay() {
        Builder builder = new NestedEventBuilder();
        Assert.assertEquals(builder, builder.withComponent("event").endComponent());
        Assert.assertFalse(builder.getRoot().toIterator().hasNext());
    }

    @Test
    public void TestAddEvent() {
        Builder builder = new NestedEventBuilder();
        BasicEvent event = new BasicEvent("Event");
        builder
            .withComponent("day")
            .addEvent(new NestedEventBuilder()
                .withComponent("Nested")
                .addEvent(event)
                .end());
        Iterator<Event> innerEventIterator = builder.getRoot().toIterator().next().toIterator();
        Assert.assertTrue(innerEventIterator.hasNext());
        Assert.assertEquals(event, innerEventIterator.next());
    }

    @Test
    public void TestEnd() {
        Builder builder = new NestedEventBuilder();
        Assert.assertEquals(builder.getRoot(), builder.end());
    }
}
