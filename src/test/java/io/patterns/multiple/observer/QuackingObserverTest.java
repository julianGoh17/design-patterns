package io.patterns.multiple.observer;

import io.patterns.multiple.duck.MallardDuck;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class QuackingObserverTest {
    @Test
    public void TestGetObservedQuacks() {
        Researcher observer = new Researcher();
        Assert.assertEquals(0, observer.getSeenQuacks());
    }

    @Test
    public void TestUpdate() {
        Researcher observer = new Researcher();
        observer.update(new MallardDuck());
        Assert.assertEquals(1, observer.getSeenQuacks());
    }
}
