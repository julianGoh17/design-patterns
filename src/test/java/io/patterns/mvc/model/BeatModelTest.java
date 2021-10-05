package io.patterns.mvc.model;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class BeatModelTest {
    @Test
    public void TestGetterAndSetters() {
        BeatModel model = new DJBeatModel();
        Assert.assertEquals(DJBeatModel.DEFAULT_BEATS, model.getBeat());
        Assert.assertFalse(model.isOn());
        int newBeats = 100;
        model.setBeat(newBeats);
        model.setIsOn(true);
        Assert.assertEquals(newBeats, model.getBeat());
        Assert.assertTrue(model.isOn());
    }

    @Test
    public void TestTurnOn() {
        BeatModel model = new DJBeatModel();
        model.setBeat(100);
        model.turnOn();
        Assert.assertTrue(model.isOn());
        Assert.assertEquals(DJBeatModel.DEFAULT_BEATS, model.getBeat());
    }

    @Test
    public void TestOff() {
        BeatModel model = new DJBeatModel();
        model.setIsOn(true);
        model.turnOff();
        Assert.assertFalse(model.isOn());
        Assert.assertEquals(0, model.getBeat());
    }
}
