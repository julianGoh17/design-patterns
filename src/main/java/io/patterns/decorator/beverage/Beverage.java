package io.patterns.decorator.beverage;

public abstract class Beverage {
    protected String description;

    public abstract double getCost();

    public String getDescription() {
        return this.description;
    }
}
