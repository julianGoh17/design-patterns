package io.patterns.interpreter.expressions;

import io.patterns.flyweight.Pair;
import io.patterns.interpreter.runner.Runner;

import java.util.regex.Pattern;

public class ForExpression implements Expression {
    private final Runner runner;
    private final CommandExpression commandExpression;
    private final ConditionExpression conditionExpression;

    private final Pattern pattern = Pattern.compile("for [0-9]+: (forward|right)", Pattern.CASE_INSENSITIVE);

    public ForExpression(Runner runner) {
        this.runner = runner;
        this.commandExpression = new CommandExpression(runner);
        this.conditionExpression = new ConditionExpression();
    }

    @Override
    public void evaluate(String expression) {
        Pair<String, String> components = createExpressionComponents(expression);
        this.conditionExpression.evaluate(components.getLeft());
        while (this.conditionExpression.isValid()) {
            this.commandExpression.evaluate(components.getRight());
            this.conditionExpression.advance();
        }
    }

    /**
     * Exposed for testing
     * The condition component is stored in the left of the pair
     * The command component is stored in the right of the pair
     */
    public Pair<String, String> createExpressionComponents(String expression) {
        String[] components = expression.split(":");
        return new Pair<>(extractCondition(components[0]), extractCommand(components[1]));
    }

    private String extractCondition(String expression) {
        String[] components = expression.split(" ");
        return components[1];
    }

    private String extractCommand(String component) {
        return component.trim();
    }


    @Override
    public boolean isValidFor(String expression) {
        return pattern.matcher(expression).matches();
    }
}
