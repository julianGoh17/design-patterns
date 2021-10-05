package io.patterns.mvc.model;

public interface BeatModel {
    int getBeat();

    void setBeat(int beat);

    boolean isOn();

    void setIsOn(boolean isOn);

    void turnOn();

    void turnOff();
}
