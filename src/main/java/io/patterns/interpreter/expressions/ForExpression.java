package io.patterns.interpreter.expressions;

import io.patterns.interpreter.runner.Runner;

import java.util.regex.Pattern;

public class ForExpression implements Expression {
    private final Runner runner;
    private final Pattern pattern = Pattern.compile("for [0-9]+: (forward|right)", Pattern.CASE_INSENSITIVE);

    public ForExpression(Runner runner) {
        this.runner = runner;
    }

    @Override
    public void evaluate(String expression) {

    }

    /**
     * Exposed for testing
     * The condition component is stored in the left of the pair
     * The command component is stored in the right of the pair
     */
//    public Pair<String, String> createExpressionComponents(String expression) {
//        String[] components = expression.split(":");
//    }

    @Override
    public boolean isValidFor(String expression) {
        return pattern.matcher(expression).find();
    }
}
