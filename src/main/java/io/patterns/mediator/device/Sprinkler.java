package io.patterns.mediator.device;

public class Sprinkler extends Device {
    @Override
    public void onWeekendEvent() {
        setEnabled(true);
    }
}
