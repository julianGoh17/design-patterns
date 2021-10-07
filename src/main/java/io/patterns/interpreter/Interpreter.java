package io.patterns.interpreter;

import io.patterns.interpreter.expressions.CommandExpression;
import io.patterns.interpreter.expressions.ForExpression;
import io.patterns.interpreter.runner.Runner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Interpreter {
    private final Runner runner;
    private final List<String> expressions;
    private final CommandExpression commandExpression;
    private final ForExpression forExpression;

    public Interpreter(String program) {
        this.runner = new Runner();
        this.expressions = new ArrayList<>();
        Arrays
            .stream(program.split(";"))
            .map(String::trim)
            .filter(expression -> !expression.isEmpty())
            .forEach(this.expressions::add);
        this.commandExpression = new CommandExpression(runner);
        this.forExpression = new ForExpression(runner);
    }

    public Runner getRunner() {
        return runner;
    }

    public List<String> getExpressions() {
        return expressions;
    }

    public void evaluate() {
        expressions.forEach(expression -> {
            if (commandExpression.isValidFor(expression)) {
                commandExpression.evaluate(expression);
            } else if (forExpression.isValidFor(expression)) {
                forExpression.evaluate(expression);
            }
        });
    }
}
