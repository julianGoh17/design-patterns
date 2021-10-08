package io.patterns.mediator.device;

import org.junit.Assert;
import org.junit.Test;

public class DeviceTest extends BaseDeviceTest {
    private static class TestDevice extends Device { }

    @Test
    public void TestDeviceClass() {
        Device device = new TestDevice();
        Assert.assertFalse(device.isEnabled());
        device.setEnabled(true);
        Assert.assertTrue(device.isEnabled());
        device.reset();
        Assert.assertFalse(device.isEnabled());

        AssertMethodThrowsUnsupportedOperation(device::onAlarmEvent);
        AssertMethodThrowsUnsupportedOperation(device::onWeekendEvent);
    }
}
