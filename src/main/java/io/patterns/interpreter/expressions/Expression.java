package io.patterns.interpreter.expressions;

public interface Expression {
    void evaluate(String expression);

    boolean isValidFor(String expression);
}
