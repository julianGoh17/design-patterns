package io.patterns.interpreter.expressions;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ConditionExpressionTest {
    @Test
    public void TestIsValidFor() {
        Expression expression = new ConditionExpression();
        Assert.assertTrue(expression.isValidFor("1234"));
        Assert.assertFalse(expression.isValidFor("invalid"));
        Assert.assertFalse(expression.isValidFor(""));
    }

    @Test
    public void TestEvaluateValidExpression() {
        ConditionExpression expression = new ConditionExpression();
        int iterations = 3;
        expression.evaluate(Integer.toString(iterations));
        while (expression.isValid()) {
            expression.advance();
            iterations -= 1;
        }
        Assert.assertEquals(0, iterations);
    }

    @Test
    public void TestEvaluateInvalidExpression() {
        ConditionExpression expression = new ConditionExpression();
        expression.evaluate("string");
        Assert.assertFalse(expression.isValid());
    }
}
