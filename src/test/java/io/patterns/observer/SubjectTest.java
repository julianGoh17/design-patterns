package io.patterns.observer;

import io.patterns.observer.observer.Observer;
import io.patterns.observer.observer.WeatherDisplay;
import io.patterns.observer.subject.Subject;
import io.patterns.observer.subject.WeatherData;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class SubjectTest {
    @Test
    public void TestSubjectCanAddObserver() {
        Subject subject = new WeatherData();
        Observer observer = new WeatherDisplay();
        subject.addObserver(observer);
        Assert.assertEquals(getWeatherDataObservers(subject).size(), 1);
    }

    @Test
    public void TestSubjectRemoveObserver() {
        Subject subject = new WeatherData();
        Observer observer = new WeatherDisplay();
        subject.removeObserver(observer);

        subject.addObserver(observer);
        Assert.assertEquals(getWeatherDataObservers(subject).size(), 1);
        subject.removeObserver(observer);
        Assert.assertEquals(getWeatherDataObservers(subject).size(), 0);
    }

    @Test
    public void TestSubjectNotifyObserver() {
        Subject subject = new WeatherData();
        Observer observer = new WeatherDisplay();
        subject.addObserver(observer);

        castToWeatherData(subject).setTemperature(QuackingObserverTest.TEMPERATURE);
        castToWeatherData(subject).setHumidity(QuackingObserverTest.HUMIDITY);
        castToWeatherData(subject).setPressure(QuackingObserverTest.PRESSURE);

        subject.notifyObservers();

        Assert.assertEquals(QuackingObserverTest.TEMPERATURE, QuackingObserverTest.castToWeatherDisplay(observer).getDisplayedTemperature(), 0);
        Assert.assertEquals(QuackingObserverTest.HUMIDITY, QuackingObserverTest.castToWeatherDisplay(observer).getDisplayedHumidity(), 0);
        Assert.assertEquals(QuackingObserverTest.PRESSURE, QuackingObserverTest.castToWeatherDisplay(observer).getDisplayedPressure(), 0);
    }

    private WeatherData castToWeatherData(Subject subject) {
        return ((WeatherData) subject);
    }

    private ArrayList<Observer> getWeatherDataObservers(Subject subject) {
        return castToWeatherData(subject).getObservers();
    }
}
