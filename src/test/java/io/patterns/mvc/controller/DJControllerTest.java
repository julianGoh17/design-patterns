package io.patterns.mvc.controller;

import io.patterns.mvc.model.BeatModel;
import io.patterns.mvc.model.DJBeatModel;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class DJControllerTest {
    @Test
    public void TestEnableSystem() {
        BeatModel model = new DJBeatModel();
        Controller controller = new DJController(model);
        controller.enableSystem();
        Assert.assertEquals(DJBeatModel.DEFAULT_BEATS, model.getBeat());
        Assert.assertTrue(model.isOn());
    }

    @Test
    public void TestDisableSystem() {
        BeatModel model = new DJBeatModel();
        Controller controller = new DJController(model);
        controller.disableSystem();
        Assert.assertEquals(0, model.getBeat());
        Assert.assertFalse(model.isOn());
    }

    @Test
    public void TestIncrementBeat() {
        BeatModel model = new DJBeatModel();
        Controller controller = new DJController(model);
        controller.incrementBeat();
        Assert.assertEquals(91, model.getBeat());
        Assert.assertFalse(model.isOn());
    }

    @Test
    public void TestDecrementBeat() {
        BeatModel model = new DJBeatModel();
        Controller controller = new DJController(model);
        controller.decrementBeat();
        Assert.assertEquals(89, model.getBeat());
        Assert.assertFalse(model.isOn());
    }
}
