package io.patterns.interpreter;

import io.patterns.interpreter.runner.Direction;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class InterpreterTest {
    private final static String BASIC_COMMAND = "forward;\n";
    private final static String COMPLICATED_COMMAND = "right;\n"
        + "for 5: forward;\n"
        + "for 1: right;\n"
        + "forward;\n";

    @Test
    public void TestGetter() {
        Interpreter interpreter = new Interpreter(BASIC_COMMAND);
        Assert.assertNotNull(interpreter.getRunner());
        Assert.assertEquals(1, interpreter.getExpressions().size());

        interpreter = new Interpreter("test;\nprogram");
        Assert.assertEquals("test", interpreter.getExpressions().get(0));
        Assert.assertEquals("program", interpreter.getExpressions().get(1));
    }

    @Test
    public void TestEvaluateBasicExpression() {
        Interpreter interpreter = new Interpreter(BASIC_COMMAND);
        interpreter.evaluate();
        Assert.assertEquals(Direction.NORTH, interpreter.getRunner().getDirection());
        Assert.assertEquals(0, interpreter.getRunner().getX());
        Assert.assertEquals(1, interpreter.getRunner().getY());
    }

    @Test
    public void TestEvaluateComplexExpression() {
        Interpreter interpreter = new Interpreter(COMPLICATED_COMMAND);
        interpreter.evaluate();
        Assert.assertEquals(Direction.SOUTH, interpreter.getRunner().getDirection());
        Assert.assertEquals(5, interpreter.getRunner().getX());
        Assert.assertEquals(-1, interpreter.getRunner().getY());
    }
}
