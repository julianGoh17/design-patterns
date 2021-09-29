package io.patterns.observer.observer;

public interface Observer {
    void update(double temperature, double humidity, double pressure);
}
