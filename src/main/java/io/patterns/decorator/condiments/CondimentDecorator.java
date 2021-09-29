package io.patterns.decorator.condiments;

import io.patterns.decorator.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
    protected final Beverage base;

    public CondimentDecorator(Beverage base) {
        this.base = base;
    }
}
