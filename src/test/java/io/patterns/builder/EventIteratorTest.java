package io.patterns.builder;

import io.patterns.builder.builder.NestedEventBuilder;
import io.patterns.builder.builder.VacationBuilder;
import io.patterns.builder.event.BasicEvent;
import io.patterns.builder.event.Event;
import io.patterns.builder.iterator.EventIterator;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class EventIteratorTest {
    @Test
    public void TestInit() {
        EventIterator<Event> eventIterator = new EventIterator<>(getEmptyVacationBuilder());
        Assert.assertFalse(eventIterator.hasNext());
        Assert.assertNull(eventIterator.next());
        Assert.assertEquals(0, eventIterator.getStack().size());
    }

    @Test
    public void TestWithNestedEvent() {
        EventIterator<Event> eventIterator = new EventIterator<>(getNestedVacationBuilder());
        Assert.assertTrue(eventIterator.hasNext());
        Assert.assertEquals("node", eventIterator.next().getName());
        Assert.assertFalse(eventIterator.hasNext());
    }

    @Test
    public void TestWithMultipleEvents() {
        VacationBuilder builder = (VacationBuilder) new VacationBuilder()
            .withComponent("day")
            .addEvent(new NestedEventBuilder()
                .withComponent("nested")
                .addEvent(new BasicEvent("1"))
                .endComponent()
                .end())
            .addEvent(new BasicEvent("2"))
            .endComponent();

        EventIterator<Event> eventIterator = new EventIterator<>(builder);
        List<String> expected = Arrays.asList("1", "2");
        int index = 0;

        while (eventIterator.hasNext()) {
            Assert.assertEquals(expected.get(index), eventIterator.next().getName());
            index += 1;
        }
        Assert.assertEquals(2, index);
    }


    private VacationBuilder getEmptyVacationBuilder() {
        return (VacationBuilder) new VacationBuilder()
            .endComponent();
    }

    private VacationBuilder getNestedVacationBuilder() {
        return (VacationBuilder) new VacationBuilder()
            .withComponent("day")
            .addEvent(new NestedEventBuilder()
                .withComponent("nested")
                .addEvent(new BasicEvent("node"))
                .endComponent()
                .end())
            .endComponent();
    }
}
