package io.patterns.facade.system;

import org.junit.Assert;
import org.junit.Test;

public class SoundSystemTest {
    public static final int VOLUME = 10;
    @Test
    public void TestInit() {
        SoundSystem system = new SoundSystem();
        Assert.assertFalse(system.isEnabled());
        Assert.assertEquals(0, system.getVolume());
    }

    @Test
    public void TestSetters() {
        SoundSystem system = new SoundSystem();
        system.setEnabled(true);
        system.setVolume(VOLUME);

        Assert.assertTrue(system.isEnabled());
        Assert.assertEquals(VOLUME, system.getVolume());
    }
}
