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
}
