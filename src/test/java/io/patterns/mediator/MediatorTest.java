package io.patterns.mediator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class MediatorTest {
    @Test
    public void TestInitialization() {
        Mediator mediator = new Mediator();
        Assert.assertNotNull(mediator.getAlarm());
        Assert.assertNotNull(mediator.getCalendar());
        Assert.assertNotNull(mediator.getSprinkler());
    }

    @Test
    public void TestUpdateStateOnAlarmEvents() {
        Mediator mediator = new Mediator();
        mediator.getAlarm().setEnabled(true);
        mediator.updateState();

        Assert.assertEquals(1, mediator.getCalendar().getDay());
    }

    @Test
    public void TestUpdateStateOnWeekendEvents() {
        Mediator mediator = new Mediator();
        for (int i = 0; i < 6; i++) mediator.getCalendar().onAlarmEvent();

        mediator.updateState();
        Assert.assertEquals(6, mediator.getCalendar().getDay());
        Assert.assertTrue(mediator.getSprinkler().isEnabled());
    }
}
