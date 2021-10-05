package io.patterns.mvc.controller;

import io.patterns.mvc.model.BeatModel;

public class DJController implements Controller {
    private final BeatModel model;

    public DJController(BeatModel model) {
        this.model = model;
    }
}
