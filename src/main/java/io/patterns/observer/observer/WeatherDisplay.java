package io.patterns.observer.observer;

public class WeatherDisplay implements Observer, Display {
    private double displayedTemperature;
    private double displayedHumidity;
    private double displayedPressure;
    private String display;

    public WeatherDisplay() {
        this.displayedTemperature = 0;
        this.displayedHumidity = 0;
        this.displayedPressure = 0;
        this.display = "";
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.displayedTemperature = temperature;
        this.displayedHumidity = humidity;
        this.displayedPressure = pressure;
    }

    @Override
    public void display() {
        this.display = String.format("Temperature: .2%f\nHumidity: .2%f\nPressure: .2%f",
            displayedTemperature, displayedHumidity, displayedPressure);
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

    public String getDisplay() {
        return display;
    }
}
