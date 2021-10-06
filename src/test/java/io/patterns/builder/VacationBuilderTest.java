package io.patterns.builder;

import io.patterns.builder.builder.Builder;
import io.patterns.builder.builder.VacationBuilder;
import io.patterns.builder.event.BasicEvent;
import io.patterns.builder.event.Event;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

public class VacationBuilderTest {
    @Test
    public void TestInitialization() {
        Builder builder = new VacationBuilder();
        Assert.assertEquals("Vacation", builder.getRoot().getName());
    }

    @Test
    public void TestWithComponent() {
        Builder builder = new VacationBuilder();
        Assert.assertEquals(builder, builder.withComponent("day"));
        Assert.assertFalse(builder.getRoot().toIterator().hasNext());
    }

    @Test
    public void TestEndDay() {
        Builder builder = new VacationBuilder();
        Assert.assertEquals(builder, builder.withComponent("day").endComponent());
        Assert.assertTrue(builder.getRoot().toIterator().hasNext());
        Assert.assertEquals("day", builder.getRoot().toIterator().next().getName());
    }

    @Test
    public void TestAddNestedEvent() {
        Builder builder = new VacationBuilder();
        BasicEvent event = new BasicEvent("Event");
        Assert.assertEquals(builder, builder.withComponent("day").addEvent(event));
        builder.endComponent();
        Iterator<Event> dayIterator = builder.getRoot().toIterator().next().toIterator();
        Assert.assertTrue(dayIterator.hasNext());
        Assert.assertEquals(event, dayIterator.next());
    }

    @Test
    public void TestEnd() {
        Builder builder = new VacationBuilder();
        Assert.assertEquals(builder.getRoot(), builder.end());
    }
}
