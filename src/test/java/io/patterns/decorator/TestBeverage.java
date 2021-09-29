package io.patterns.decorator;

import io.patterns.decorator.beverage.Beverage;

public class TestBeverage extends Beverage {
    public TestBeverage() {
        this.description = "";
    }

    @Override
    public double getCost() {
        return 0;
    }
}
