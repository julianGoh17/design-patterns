package io.patterns.template.drinks;

import io.patterns.template.DrinkContainer;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestIcedCoffee {
    @Test
    public void TestBoil() {
        DrinkContainer container = new DrinkContainer();
        Drink drink = new IcedCoffee(container);
        drink.boil();
        Assert.assertFalse(container.isBoiled());
    }

    @Test
    public void TestAddCondiments() {
        DrinkContainer container = new DrinkContainer();
        Drink drink = new IcedCoffee(container);
        drink.addCondiments();
        Assert.assertEquals(1, container.getCondiments().size());
        Assert.assertEquals("Ice", container.getCondiments().get(0));
    }

    @Test
    public void TestAddContents() {
        DrinkContainer container = new DrinkContainer();
        Drink drink = new IcedCoffee(container);
        drink.addContents();
        Assert.assertTrue(container.isFull());
        Assert.assertEquals("Coffee", container.getContents());
    }

    @Test
    public void TestPrepare() {
        DrinkContainer container = new DrinkContainer();
        Drink drink = new IcedCoffee(container);
        drink.prepare();
        Assert.assertTrue(container.isFull());
        Assert.assertEquals("Coffee", container.getContents());
        Assert.assertEquals(1, container.getCondiments().size());
        Assert.assertEquals("Ice", container.getCondiments().get(0));
        Assert.assertFalse(container.isBoiled());
    }
}
