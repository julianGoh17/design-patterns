package test.java.patterns.strategy;

import io.patterns.strategy.quack.LoudQuack;
import io.patterns.strategy.quack.QuackBehaviour;
import io.patterns.strategy.quack.SilentQuack;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class QuackBehaviourTest {
    @Test
    public void TestQuacks() {
        QuackBehaviour quackBehaviour = new LoudQuack();
        Assert.assertTrue(quackBehaviour.quack());
        quackBehaviour = new SilentQuack();
        Assert.assertFalse(quackBehaviour.quack());
    }
}
