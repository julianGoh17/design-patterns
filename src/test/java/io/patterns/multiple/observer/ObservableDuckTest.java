package io.patterns.multiple.observer;

import io.patterns.multiple.decorators.DuckCounter;
import io.patterns.multiple.duck.MallardDuck;
import io.patterns.multiple.factory.CountingDuckFactory;
import io.patterns.multiple.iterator.Flock;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ObservableDuckTest {
    @Test
    public void TestAddObserver() {
        Observable duck = new Observable(new MallardDuck());
        duck.addObserver(new Researcher());
        Assert.assertEquals(1, duck.getObservers().size());
    }

    @Test
    public void TestNotifyObservers() {
        Researcher observer = new Researcher();
        Observable duck = new Observable(new MallardDuck());
        duck.addObserver(observer);
        duck.notifyObservers();
        Assert.assertEquals(1, observer.getSeenQuacks());
    }

    @Test
    public void TestNotifyObserversOnFlock() {
        DuckCounter.reset();
        Researcher observer = new Researcher();
        Flock flock = new Flock();
        CountingDuckFactory factory = new CountingDuckFactory();

        flock.add(factory.getMallardDuck());
        flock.add(factory.getRubberDuck());
        flock.add(factory.getGeese());
        flock.addObserver(observer);
        flock.quack();


        Assert.assertEquals(3, observer.getSeenQuacks());
        Assert.assertEquals(2, DuckCounter.getQuacks());
    }
}
