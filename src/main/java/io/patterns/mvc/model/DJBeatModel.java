package io.patterns.mvc.model;

import io.patterns.mvc.view.Observer;

import java.util.ArrayList;
import java.util.List;

public class DJBeatModel implements BeatModel, Observable {
    public static final int DEFAULT_BEATS = 90;
    private int beats = DEFAULT_BEATS;
    private final List<Observer> observers = new ArrayList<>();

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
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        this.observers.forEach(observer -> observer.update(this));
    }

    @Override
    public void setBeat(int beat) {
        this.beats = beat;
        notifyObservers();
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

    @Override
    public List<Observer> getObservers() {
        return observers;
    }
}
