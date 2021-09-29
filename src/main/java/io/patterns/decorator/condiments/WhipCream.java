package io.patterns.decorator.condiments;

import io.patterns.decorator.beverage.Beverage;

public class WhipCream extends CondimentDecorator {
    public static final double COST = 0.50;

    public WhipCream(Beverage base) {
        super(base);
    }

    @Override
    public String getDescription() {
        return base.getDescription() + ", whip cream";
    }

    @Override
    public double getCost() {
        return base.getCost() + COST;
    }
}
