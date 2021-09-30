package io.patterns.template.drinks;

import io.patterns.template.DrinkContainer;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TeaTest {
    @Test
    public void TestPrepare() {
        DrinkContainer container = new DrinkContainer();
        Drink drink = new Tea(container);
        drink.prepare();
        Assert.assertTrue(container.isBoiled());
        Assert.assertTrue(container.isFull());
        Assert.assertEquals(1, container.getCondiments().size());
        Assert.assertEquals("Lemon", container.getCondiments().get(0));
        Assert.assertEquals("Tea", container.getContents());
    }

    @Test
    public void TestAddContents() {
        DrinkContainer container = new DrinkContainer();
        Drink drink = new Tea(container);
        drink.addContents();
        Assert.assertFalse(container.isBoiled());
        Assert.assertTrue(container.isFull());
        Assert.assertEquals(0, container.getCondiments().size());
        Assert.assertEquals("Tea", container.getContents());
    }

    @Test
    public void TestAddCondiments() {
        DrinkContainer container = new DrinkContainer();
        Drink drink = new Tea(container);
        drink.addCondiments();
        Assert.assertFalse(container.isBoiled());
        Assert.assertFalse(container.isFull());
        Assert.assertEquals(1, container.getCondiments().size());
        Assert.assertEquals("Lemon", container.getCondiments().get(0));
        Assert.assertNull(container.getContents());
    }
}
