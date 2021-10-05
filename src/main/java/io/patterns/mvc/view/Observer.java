package io.patterns.mvc.view;

import io.patterns.mvc.model.BeatModel;

public interface Observer {
    void update(BeatModel model);
}
