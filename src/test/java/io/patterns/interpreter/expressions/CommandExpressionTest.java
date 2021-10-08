package io.patterns.interpreter.expressions;

import io.patterns.interpreter.runner.Direction;
import io.patterns.interpreter.runner.Runner;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CommandExpressionTest {
    @Test
    public void TestIsValidFor() {
        Runner runner = new Runner();
        Expression expression = new CommandExpression(runner);

        Assert.assertTrue(expression.isValidFor("Forward"));
        Assert.assertTrue(expression.isValidFor("Right"));
        Assert.assertFalse(expression.isValidFor("anything else"));
        Assert.assertFalse(expression.isValidFor(""));
        Assert.assertFalse(expression.isValidFor("this Right"));
    }

    @Test
    public void TestRight() {
        Runner runner = new Runner();
        Expression expression = new CommandExpression(runner);
        expression.evaluate("right");
        Assert.assertEquals(0, runner.getX());
        Assert.assertEquals(0, runner.getY());
        Assert.assertEquals(Direction.EAST, runner.getDirection());
    }

    @Test
    public void TestForward() {
        Runner runner = new Runner();
        Expression expression = new CommandExpression(runner);
        expression.evaluate("forward");
        Assert.assertEquals(0, runner.getX());
        Assert.assertEquals(1, runner.getY());
        Assert.assertEquals(Direction.NORTH, runner.getDirection());
    }
}
