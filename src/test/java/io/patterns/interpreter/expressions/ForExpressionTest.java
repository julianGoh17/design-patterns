package io.patterns.interpreter.expressions;

import io.patterns.flyweight.Pair;
import io.patterns.interpreter.runner.Direction;
import io.patterns.interpreter.runner.Runner;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ForExpressionTest {
    @Test
    public void TestIsValidFor() {
        Runner runner = new Runner();
        Expression expression = new ForExpression(runner);
        Assert.assertTrue(expression.isValidFor("for 1: forward"));
        Assert.assertTrue(expression.isValidFor("for 1234: right"));
        Assert.assertFalse(expression.isValidFor("for 1: advance"));
        Assert.assertFalse(expression.isValidFor("for missing: forward"));
    }

    @Test
    public void TestCreateExpressionComponents() {
        Runner runner = new Runner();
        ForExpression expression = new ForExpression(runner);
        Pair<String, String> components = expression.createExpressionComponents("for 1: right");
        Assert.assertEquals("1", components.getLeft());
        Assert.assertEquals("right", components.getRight());

        components = expression.createExpressionComponents("for 1234: forward");
        Assert.assertEquals("1234", components.getLeft());
        Assert.assertEquals("forward", components.getRight());
    }

    @Test
    public void TestEvaluate() {
        Runner runner = new Runner();
        Expression expression = new ForExpression(runner);
        expression.evaluate("for 5: forward");
        Assert.assertEquals(Direction.NORTH, runner.getDirection());
        Assert.assertEquals(5, runner.getY());
        Assert.assertEquals(0, runner.getX());
    }
}
