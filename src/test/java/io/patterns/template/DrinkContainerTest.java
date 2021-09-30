package io.patterns.template;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class DrinkContainerTest {
    @Test
    public void TestInit() {
        DrinkContainer container = new DrinkContainer();
        Assert.assertFalse(container.isBoiled());
        Assert.assertNull(container.getContents());
        Assert.assertFalse(container.isFull());
        Assert.assertEquals(0, container.getCondiments().size());
    }

    @Test
    public void TestBoiled() {
        DrinkContainer container = new DrinkContainer();
        container.boil();
        Assert.assertTrue(container.isBoiled());
    }

    @Test
    public void TestAddCondiments() {
        DrinkContainer container = new DrinkContainer();
        container.addCondiments("Test", "Other");
        Assert.assertEquals(2, container.getCondiments().size());
        Assert.assertEquals("Test", container.getCondiments().get(0));
        Assert.assertEquals("Other", container.getCondiments().get(1));
    }

    @Test
    public void TestAddContents() {
        DrinkContainer container = new DrinkContainer();
        container.addContents("Brew");
        Assert.assertTrue(container.isFull());
        Assert.assertEquals("Brew", container.getContents());
    }
}
