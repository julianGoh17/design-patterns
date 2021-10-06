package io.patterns.mvc.controller;

import io.patterns.mvc.model.BeatModel;

public class DJController implements Controller {
    private final BeatModel model;

    public DJController(BeatModel model) {
        this.model = model;
    }

    @Override
    public void enableSystem() {
        model.turnOn();
    }

    @Override
    public void disableSystem() {
        model.turnOff();
    }

    @Override
    public void incrementBeat() {
        model.setBeat(model.getBeat() + 1);
    }

    @Override
    public void decrementBeat() {
        model.setBeat(model.getBeat() - 1);
    }
}
