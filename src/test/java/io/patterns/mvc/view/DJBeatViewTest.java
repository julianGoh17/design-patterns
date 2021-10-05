package io.patterns.mvc.view;

import io.patterns.mvc.model.BeatModel;
import io.patterns.mvc.model.DJBeatModel;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class DJBeatViewTest {
    @Test
    public void TestInit() {
        DJControlView observer = new DJControlView();
        Assert.assertEquals(0, observer.getDisplayedBeat());
        Assert.assertEquals("Offline", observer.getMessage());
    }

    @Test
    public void TestDJBeatImplementsObserver() {
        DJControlView observer = new DJControlView();
        BeatModel model = new DJBeatModel();
        observer.update(model);
        Assert.assertEquals(DJBeatModel.DEFAULT_BEATS, observer.getDisplayedBeat());
        Assert.assertEquals("Beats: 90", observer.getMessage());
    }
}
