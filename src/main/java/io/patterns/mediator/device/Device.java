package io.patterns.mediator.device;

public abstract class Device {
    protected boolean isEnabled;

    public void onAlarmEvent() {
        throw new UnsupportedOperationException();
    }

    public void onWeekendEvent() {
        throw new UnsupportedOperationException();
    }

    public final boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public void reset() {
        this.isEnabled = false;
    }
}
