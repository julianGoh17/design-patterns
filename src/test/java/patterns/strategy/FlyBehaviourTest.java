package test.java.patterns.strategy;

import io.patterns.strategy.fly.FlyBehaviour;
import io.patterns.strategy.fly.FlyWithWingsBehaviour;
import io.patterns.strategy.fly.NoFlyBehaviour;
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

