package io.patterns.composite;

import io.patterns.composite.iterators.CompositeIterator;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class MenuTest {
    public static final String MENU_NAME = "Pancake Menu";
    public static final MenuComponent MENU_ITEM =  new Item(ItemTest.ITEM_NAME, ItemTest.ITEM_COST);
    public static final MenuComponent MENU =  new Menu("Other Menu");

    @Test
    public void TestMenuGetters() {
        MenuComponent menu = new Menu(MENU_NAME);
        Assert.assertEquals(MENU_NAME, menu.getName());
        try {
            menu.getCost();
            Assert.fail();
        } catch (UnsupportedOperationException e) {
            Assert.assertNotNull(e);
        }
    }

    @Test
    public void TestMenuAddItem() {
        MenuComponent menu = new Menu(MENU_NAME);
        menu.add(MENU_ITEM);
        menu.add(MENU);
    }

    @Test
    public void TestGetItemAt() {
        MenuComponent menu = new Menu(MENU_NAME);
        menu.add(MENU_ITEM);
        menu.add(MENU);
        Assert.assertEquals(MENU_ITEM, menu.getItemAt(0));
        Assert.assertEquals(MENU, menu.getItemAt(1));
        Assert.assertNull(menu.getItemAt(-1));
        Assert.assertNull(menu.getItemAt(2));
    }

    @Test
    public void TestToIterator() {
        MenuComponent menu = new Menu(MENU_NAME);
        menu.add(MENU_ITEM);
        Assert.assertEquals(CompositeIterator.class, menu.toIterator().getClass());
    }

    @Test
    public void TestToString() {
        MenuComponent menu = new Menu(MENU_NAME);
        menu.add(MENU_ITEM);
        Assert.assertEquals(String.format("%s\n%s", MENU_NAME, MENU_ITEM.toString()), menu.toString());
    }

    @Test
    public void TestNestedToString() {
        String custom_name = "Custom Menu";
        MenuComponent menu = new Menu(custom_name);
        MenuComponent nested_menu = new Menu(MENU_NAME);
        nested_menu.add(MENU_ITEM);
        menu.add(nested_menu);
        Assert.assertEquals(String.format("%s\n%s\n%s", custom_name, MENU_NAME, MENU_ITEM.toString()), menu.toString());
    }
}
