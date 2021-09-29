package io.patterns.observer.vanilla.observer;

public interface Observer {
    void update(double temperature, double humidity, double pressure);
}
