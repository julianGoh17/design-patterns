package io.patterns.iterator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class MenuItemTest {
    public static final String ITEM_NAME = "Fish and Chips";
    public static final double ITEM_COST = 3.25;
    @Test
    public void TestMenuItemInit() {
        MenuItem item = new MenuItem(ITEM_NAME, ITEM_COST);
        Assert.assertEquals(ITEM_NAME, item.getName());
        Assert.assertEquals(ITEM_COST, item.getCost(), 0);
    }
}
