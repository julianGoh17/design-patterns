package io.patterns.command.receivers;

import org.junit.Assert;
import org.junit.Test;

public class ReceiverTest {
    @Test
    public void TestLights() {
        Light light = new Light();
        Assert.assertFalse(light.isEnabled());
        light.enable();
        Assert.assertTrue(light.isEnabled());
        light.disable();
        Assert.assertFalse(light.isEnabled());
    }

    @Test
    public void TestFan() {
        Fan fan = new Fan();
        Assert.assertFalse(fan.isEnabled());
        Assert.assertEquals(Fan.STOPPED_SPEED, fan.getSpeed());

        fan.enable();
        Assert.assertTrue(fan.isEnabled());
        Assert.assertEquals(Fan.RUNNING_SPEED, fan.getSpeed());

        fan.disable();
        Assert.assertFalse(fan.isEnabled());
        Assert.assertEquals(Fan.STOPPED_SPEED, fan.getSpeed());
    }
}
