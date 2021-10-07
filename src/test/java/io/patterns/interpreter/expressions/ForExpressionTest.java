package io.patterns.interpreter.expressions;

import io.patterns.interpreter.runner.Runner;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ForExpressionTest {
    @Test
    public void TestIsValidFor() {
        Runner runner = new Runner();
        ForExpression expression = new ForExpression(runner);
        Assert.assertTrue(expression.isValidFor("for 1: forward"));
        Assert.assertTrue(expression.isValidFor("for 1234: right"));
        Assert.assertFalse(expression.isValidFor("for 1: advance"));
        Assert.assertFalse(expression.isValidFor("for missing: forward"));
    }
}
