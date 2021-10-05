package io.patterns.multiple.duck;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class DuckTest {
    @Test
    public void TestDucksCanQuack() {
        Duck mallardDuck = new MallardDuck();
        Assert.assertEquals("Quack", mallardDuck.quack());

        Duck rubberDuck = new RubberDuck();
        Assert.assertEquals("Squeak", rubberDuck.quack());

        Duck redhead = new RedHeadDuck();
        Assert.assertEquals("Kwak", redhead.quack());
    }
}
