package io.patterns.strategy;

import io.patterns.strategy.ducks.Duck;
import io.patterns.strategy.ducks.RegularDuck;
import io.patterns.strategy.ducks.RubberDuck;
import io.patterns.strategy.ducks.flyable.FlyWithWingsBehaviour;
import io.patterns.strategy.ducks.quack.LoudQuack;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class DuckTest {
    @Test
    public void TestDuckSetters() {
        Duck duck = new RubberDuck();
        Assert.assertFalse(duck.quack());
        Assert.assertFalse(duck.fly());

        duck.setFlyBehaviour(new FlyWithWingsBehaviour());
        duck.setQuackBehaviour(new LoudQuack());
        Assert.assertTrue(duck.quack());
        Assert.assertTrue(duck.fly());
    }

    @Test
    public void TestDuckFly() {
        Duck rubberDuck = new RubberDuck();
        Duck flyingDuck = new RegularDuck();
        Assert.assertFalse(rubberDuck.fly());
        Assert.assertTrue(flyingDuck.fly());
    }

    @Test
    public void TestDuckQuack() {
        Duck rubberDuck = new RubberDuck();
        Duck regularDuck = new RegularDuck();
        Assert.assertFalse(rubberDuck.quack());
        Assert.assertTrue(regularDuck.quack());
    }
}
