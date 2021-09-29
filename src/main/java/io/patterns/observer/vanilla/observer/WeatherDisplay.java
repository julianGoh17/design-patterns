package io.patterns.observer.vanilla.observer;

public class WeatherDisplay implements Observer {
    private double displayedTemperature;
    private double displayedHumidity;
    private double displayedPressure;

    public WeatherDisplay() {
        this.displayedTemperature = 0;
        this.displayedHumidity = 0;
        this.displayedPressure = 0;
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.displayedTemperature = temperature;
        this.displayedHumidity = humidity;
        this.displayedPressure = pressure;
    }

    public double getDisplayedTemperature() {
        return displayedTemperature;
    }

    public double getDisplayedHumidity() {
        return displayedHumidity;
    }

    public double getDisplayedPressure() {
        return displayedPressure;
    }
}
