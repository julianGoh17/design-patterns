package io.patterns.multiple.decorators;

import io.patterns.multiple.duck.Duck;
import io.patterns.multiple.duck.MallardDuck;
import io.patterns.multiple.duck.RubberDuck;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class DuckCounterTest {
    @Test
    public void TestGetDucks() {
        Assert.assertEquals(0, DuckCounter.getQuacks());
    }

    @Test
    public void TestQuack() {
        Duck duck = new DuckCounter(new MallardDuck());
        Duck other = new DuckCounter(new RubberDuck());
        duck.quack();
        other.quack();
        Assert.assertEquals(2, DuckCounter.getQuacks());
    }

    @Test
    public void TestGetDuck() {
        DuckCounter duck = new DuckCounter(new MallardDuck());
        Assert.assertEquals(MallardDuck.class, duck.getDuck().getClass());
    }
}
