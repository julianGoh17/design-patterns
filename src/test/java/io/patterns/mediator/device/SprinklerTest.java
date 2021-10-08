package io.patterns.mediator.device;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class SprinklerTest extends BaseDeviceTest {
    @Test
    public void TestExtendsDeviceClass() {
        Device device = new Sprinkler();
        AssertMethodThrowsUnsupportedOperation(device::onAlarmEvent);
    }

    @Test
    public void TestOnWeekendEvent() {
        Device device = new Sprinkler();
        device.onWeekendEvent();
        Assert.assertTrue(device.isEnabled());
    }
}
