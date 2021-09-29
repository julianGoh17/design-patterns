package io.patterns.decorator;

import io.patterns.decorator.beverage.Beverage;
import io.patterns.decorator.condiments.CondimentDecorator;
import io.patterns.decorator.condiments.Milk;
import io.patterns.decorator.condiments.WhipCream;
import org.junit.Assert;
import org.junit.Test;

public class CondimentsTest {
    @Test
    public void TestCondimentGetters() {
        Beverage beverage = new TestBeverage();
        CondimentDecorator condiment = new WhipCream(beverage);
        Assert.assertEquals(", whip cream", condiment.getDescription());
        Assert.assertEquals(WhipCream.COST, condiment.getCost(), 0);
    }

    @Test
    public void TestMultipleCondimentWrappers() {
        Beverage beverage = new TestBeverage();
        beverage = new WhipCream(beverage);
        beverage = new Milk(beverage);
        Assert.assertEquals(", whip cream, milk", beverage.getDescription());
        Assert.assertEquals(WhipCream.COST + Milk.COST, beverage.getCost(), 0);
    }
}
