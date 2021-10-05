package io.patterns.mvc.model;

public class DJBeatModel implements BeatModel {
    public static final int DEFAULT_BEATS = 90;
    private int beats = DEFAULT_BEATS;

    private boolean isOn = false;

    @Override
    public void turnOn() {
        isOn = true;
        setBeat(DEFAULT_BEATS);
    }

    @Override
    public void turnOff() {
        isOn = false;
        setBeat(0);
    }

    @Override
    public void setBeat(int beat) {
        this.beats = beat;
    }

    @Override
    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public int getBeat() {
        return beats;
    }
}
