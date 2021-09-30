package io.patterns.facade.system;

import org.junit.Assert;
import org.junit.Test;

public class TheatreLightTest {
    public final static double LUMINOSITY = 0.5;
    @Test
    public void TestInit() {
        TheatreLight light = new TheatreLight();
        Assert.assertFalse(light.isEnabled());
        Assert.assertEquals(0, light.getLuminosity(), 0);
    }

    @Test
    public void TestSetters() {
        TheatreLight light = new TheatreLight();
        light.setEnabled(true);
        light.setLuminosity(LUMINOSITY);

        Assert.assertTrue(light.isEnabled());
        Assert.assertEquals(LUMINOSITY, light.getLuminosity(), 0);
    }
}
