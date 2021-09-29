package io.patterns.strategy;

import io.patterns.strategy.ducks.fly.FlyBehaviour;
import io.patterns.strategy.ducks.fly.FlyWithWingsBehaviour;
import io.patterns.strategy.ducks.fly.NoFlyBehaviour;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class FlyBehaviourTest {
    @Test
    public void TestFly() {
        FlyBehaviour flyBehaviour = new FlyWithWingsBehaviour();
        Assert.assertTrue(flyBehaviour.fly());
        flyBehaviour = new NoFlyBehaviour();
        Assert.assertFalse(flyBehaviour.fly());
    }
}

