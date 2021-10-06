package io.patterns.builder;

import io.patterns.builder.event.BasicEvent;
import io.patterns.builder.event.Event;
import io.patterns.builder.event.NestedEvent;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

public class EventTest {
    public static final String EVENT_NAME = "event-name";

    @Test
    public void TestBasicEvent() {
        Event event = new BasicEvent(EVENT_NAME);
        Assert.assertEquals(EVENT_NAME, event.getName());
        Iterator<Event> iterator = event.toIterator();
        Assert.assertFalse(iterator.hasNext());
        Assert.assertNull(iterator.next());
        try {
            event.addEvent(new BasicEvent(EVENT_NAME));
            Assert.fail("Should have thrown exception");
        } catch (UnsupportedOperationException e) {
            Assert.assertNotNull(e);
        }
        try {
            event.getNumberOfDirectChildEvents();
            Assert.fail("Should have thrown exception");
        } catch (UnsupportedOperationException e) {
            Assert.assertNotNull(e);
        }
    }

    @Test
    public void TestNestedEvent() {
        Event event = new NestedEvent(EVENT_NAME);
        Assert.assertEquals(EVENT_NAME, event.getName());
        Event child = new BasicEvent(EVENT_NAME);
        event.addEvent(child);

        Iterator<Event> iterator = event.toIterator();
        Assert.assertTrue(iterator.hasNext());
        Assert.assertEquals(child, iterator.next());
        Assert.assertFalse(iterator.hasNext());
        Assert.assertEquals(1, event.getNumberOfDirectChildEvents());
    }
}
