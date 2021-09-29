package io.patterns.decorator;

import io.patterns.decorator.beverage.Beverage;
import io.patterns.decorator.beverage.Coffee;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class BeverageTest {
    @Test
    public void TestBeverageGetter() {
        Beverage beverage = new Coffee();
        Assert.assertEquals(Coffee.COST, beverage.getCost(), 0);
        Assert.assertEquals("Coffee", beverage.getDescription());
    }
}
