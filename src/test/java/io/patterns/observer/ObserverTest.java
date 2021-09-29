package test.java.io.patterns.observer;

import io.patterns.observer.observer.Observer;
import io.patterns.observer.observer.WeatherDisplay;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ObserverTest {
    public static final double TEMPERATURE = 10.5;
    public static final double HUMIDITY = 12.5;
    public static final double PRESSURE = 1;

    @Test
    public void TestObserverUpdateMethod() {
        Observer observer = new WeatherDisplay();
        Assert.assertEquals(0, castToWeatherDisplay(observer).getDisplayedTemperature(), 0);
        Assert.assertEquals(0, castToWeatherDisplay(observer).getDisplayedHumidity(), 0);
        Assert.assertEquals(0, castToWeatherDisplay(observer).getDisplayedPressure(), 0);

        observer.update(TEMPERATURE, HUMIDITY, PRESSURE);

        Assert.assertEquals(TEMPERATURE, castToWeatherDisplay(observer).getDisplayedTemperature(), 0);
        Assert.assertEquals(HUMIDITY, castToWeatherDisplay(observer).getDisplayedHumidity(), 0);
        Assert.assertEquals(PRESSURE, castToWeatherDisplay(observer).getDisplayedPressure(), 0);
    }

    public static WeatherDisplay castToWeatherDisplay(Observer observer) {
        return (WeatherDisplay) observer;
    }
}
