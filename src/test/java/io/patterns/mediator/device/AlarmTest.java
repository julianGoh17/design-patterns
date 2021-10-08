package io.patterns.mediator.device;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class AlarmTest extends BaseDeviceTest {
    @Test
    public void TestExtendsDeviceClass() {
        Device device = new Alarm();
        AssertMethodThrowsUnsupportedOperation(device::onAlarmEvent);
        AssertMethodThrowsUnsupportedOperation(device::onWeekendEvent);
    }

    @Test
    public void TestAlarmSetEnabled() {
        Alarm alarm = new Alarm();
        Assert.assertFalse(alarm.isEnabled());
        alarm.setEnabled(true);
    }
}
