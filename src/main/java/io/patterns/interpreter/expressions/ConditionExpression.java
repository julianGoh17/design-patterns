package io.patterns.interpreter.expressions;

import java.util.regex.Pattern;

public class ConditionExpression implements Expression {
    private final Pattern pattern = Pattern.compile("^[0-9]");
    private int iterations;

    @Override
    public void evaluate(String expression) {
        try {
            this.iterations = Integer.parseInt(expression);
        } catch (NumberFormatException e) {
            this.iterations = 0;
        }
    }

    @Override
    public boolean isValidFor(String expression) {
        return pattern.matcher(expression).find();
    }

    public boolean isValid() {
        return iterations > 0;
    }

    public void advance() {
        if (isValid()) {
            this.iterations -= 1;
        }
    }
}
