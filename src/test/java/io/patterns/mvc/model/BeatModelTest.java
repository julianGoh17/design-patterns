package io.patterns.mvc.model;

import io.patterns.mvc.view.DJControlView;
import io.patterns.mvc.view.Observer;
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
        DJBeatModel model = new DJBeatModel();
        DJControlView view = new DJControlView();
        model.addObserver(view);
        model.setBeat(100);
        model.turnOn();
        Assert.assertTrue(model.isOn());
        Assert.assertEquals(DJBeatModel.DEFAULT_BEATS, model.getBeat());
        Assert.assertEquals(DJBeatModel.DEFAULT_BEATS, view.getDisplayedBeat());
    }

    @Test
    public void TestOff() {
        DJBeatModel model = new DJBeatModel();
        DJControlView view = new DJControlView();
        model.addObserver(view);
        model.setIsOn(true);
        model.turnOff();
        Assert.assertFalse(model.isOn());
        Assert.assertEquals(0, model.getBeat());
        Assert.assertEquals(0, view.getDisplayedBeat());
    }

    @Test
    public void TestImplementsObservable() {
        int beat = 101;
        DJBeatModel observable = new DJBeatModel();
        observable.setBeat(beat);

        Assert.assertEquals(0, observable.getObservers().size());
        Observer observer = new DJControlView();

        observable.addObserver(observer);
        Assert.assertEquals(1, observable.getObservers().size());

        observable.notifyObservers();
        DJControlView view = (DJControlView) observer;
        Assert.assertEquals(beat, view.getDisplayedBeat());

        observable.removeObserver(observer);
        Assert.assertEquals(0, observable.getObservers().size());

    }
}
