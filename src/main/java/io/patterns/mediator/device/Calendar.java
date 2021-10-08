package io.patterns.mediator.device;

public class Calendar extends Device {
    private int day = 0;

    public Calendar() {
        this.isEnabled = true;
    }

    @Override
    public void setEnabled(boolean isEnabled) {
        this.isEnabled = true;
    }

    @Override
    public void reset() {
        this.isEnabled = true;
    }

    @Override
    public void onAlarmEvent() {
        this.day = (day + 1) % 7;
    }

    public int getDay() {
        return day;
    }
}
