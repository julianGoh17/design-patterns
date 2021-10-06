package io.patterns.mvc.view;

import io.patterns.mvc.model.BeatModel;

public class DJControlView implements Observer {
    private int displayedBeat = 0;
    private String message;

    public DJControlView() {
        setMessage();
    }

    @Override
    public void update(BeatModel model) {
        displayedBeat = model.getBeat();
        setMessage();
    }

    private void setMessage() {
        if (displayedBeat == 0) {
            message = "Offline";
        } else {
            message = String.format("Beats: %d", displayedBeat);
        }
    }

    public int getDisplayedBeat() {
        return displayedBeat;
    }

    public String getMessage() {
        return message;
    }
}
