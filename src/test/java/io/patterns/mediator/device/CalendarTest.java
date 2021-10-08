package io.patterns.mediator.device;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CalendarTest extends BaseDeviceTest {
    @Test
    public void TestExtendsDeviceTest() {
        Device device = new Calendar();
        AssertMethodThrowsUnsupportedOperation(device::onWeekendEvent);
    }

    @Test
    public void TestAlwaysEnabled() {
        Device device = new Calendar();
        Assert.assertTrue(device.isEnabled());
        device.setEnabled(false);
        Assert.assertTrue(device.isEnabled());
        device.reset();
        Assert.assertTrue(device.isEnabled());
    }

    @Test
    public void TestOnAlarmEvent() {
        Calendar device = new Calendar();
        Assert.assertEquals(0, device.getDay());
        device.onAlarmEvent();
        Assert.assertEquals(1, device.getDay());
    }

    @Test
    public void TestCalendarResetsDay() {
        Calendar device = new Calendar();
        for (int i = 0; i < 7; i++) {
            device.onAlarmEvent();
        }
        Assert.assertEquals(0, device.getDay());
    }
}
