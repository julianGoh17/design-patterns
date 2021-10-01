package io.patterns.composite;

import io.patterns.composite.iterators.NullIterator;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ItemTest {
    public static final String ITEM_NAME = "Fish";
    public static final double ITEM_COST = 2.85;

    @Test
    public void TestInit() {
        MenuComponent component = new Item(ITEM_NAME, ITEM_COST);
        Assert.assertEquals(ITEM_NAME, component.getName());
        Assert.assertEquals(ITEM_COST, component.getCost(), 0);
    }

    @Test
    public void TestToString() {
        MenuComponent component = new Item(ITEM_NAME, ITEM_COST);
        Assert.assertEquals(ItemTest.toString(ITEM_NAME, ITEM_COST), component.toString());
    }

    @Test
    public void TestAssertThrows() {
        MenuComponent component = new Item(ITEM_NAME, ITEM_COST);
        try {
            component.add(component);
            Assert.fail();
        } catch (UnsupportedOperationException e) {
            Assert.assertNotNull(e);
        }
        try {
            component.getItemAt(0);
            Assert.fail();
        } catch (UnsupportedOperationException e) {
            Assert.assertNotNull(e);
        }
    }

    @Test
    public void TestToIterator() {
        MenuComponent component = new Item(ITEM_NAME, ITEM_COST);
        Assert.assertEquals(NullIterator.class, component.toIterator().getClass());
    }

    public static String toString(String name, double cost) {
        return String.format("%s: $%.2f", name, cost);
    }
}
