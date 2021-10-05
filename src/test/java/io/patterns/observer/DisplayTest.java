package io.patterns.observer;

import io.patterns.observer.observer.Display;
import io.patterns.observer.observer.WeatherDisplay;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class DisplayTest {
    @Test
    public void TestDisplayMethod() {
        Display display = new WeatherDisplay();
        String originalDisplayString = castToWeatherDisplay(display).getDisplay();
        Assert.assertEquals("", originalDisplayString);
        display.display();
        castToWeatherDisplay(display).update(QuackingObserverTest.TEMPERATURE, QuackingObserverTest.HUMIDITY, QuackingObserverTest.PRESSURE);
        Assert.assertNotEquals(originalDisplayString, castToWeatherDisplay(display).getDisplay());
    }

    private static WeatherDisplay castToWeatherDisplay(Display display) {
        return (WeatherDisplay) display;
    }
}
