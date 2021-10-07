package io.patterns.interpreter.expressions;

import io.patterns.interpreter.runner.Runner;

import java.util.regex.Pattern;

public class CommandExpression implements Expression {
    private final Runner runner;
    private final Pattern regex = Pattern.compile("^forward|right$", Pattern.CASE_INSENSITIVE);

    public CommandExpression(Runner runner) {
        this.runner = runner;
    }

    @Override
    public void evaluate(String expression) {
        if (expression.equals("forward")) {
            this.runner.forward();
        } else if (expression.equals("right")) {
            this.runner.turnRight();
        }
    }

    @Override
    public boolean isValidFor(String expression) {
        return regex.matcher(expression).matches();
    }
}
