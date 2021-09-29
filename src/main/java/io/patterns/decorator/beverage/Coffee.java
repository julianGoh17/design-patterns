package io.patterns.decorator.beverage;

public class Coffee extends Beverage {
    public static final double COST = 1.05;

    public Coffee() {
        this.description = "Coffee";
    }

    @Override
    public double getCost() {
        return COST;
    }
}
