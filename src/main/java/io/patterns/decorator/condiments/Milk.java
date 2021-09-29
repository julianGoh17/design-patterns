package io.patterns.decorator.condiments;

import io.patterns.decorator.beverage.Beverage;

public class Milk extends CondimentDecorator {
    public final static double COST = 1.00;
    public Milk(Beverage base) {
        super(base);
    }

    @Override
    public double getCost() {
        return base.getCost() + COST;
    }

    @Override
    public String getDescription() {
        return base.getDescription() + ", milk";
    }
}
