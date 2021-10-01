package io.patterns.composite.iterators;

import io.patterns.composite.Menu;
import io.patterns.composite.MenuComponent;
import io.patterns.composite.MenuTest;
import io.patterns.iterator.Iterator;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MenuComponentIteratorTest {
    @Test
    public void TestEmptyIterator() {
        Iterator<MenuComponent> iterator = new CompositeIterator(Collections.emptyList());
        Assert.assertNull(iterator.next());
        Assert.assertFalse(iterator.hasNext());
    }

    @Test
    public void TestSingleItemIterator() {
        Iterator<MenuComponent> iterator = new CompositeIterator(Collections.singletonList(MenuTest.MENU));
        Assert.assertTrue(iterator.hasNext());
        while (iterator.hasNext()) {
            Assert.assertEquals(MenuTest.MENU, iterator.next());
        }
        Assert.assertFalse(iterator.hasNext());
    }

    @Test
    public void TestNestedIterator() {
        MenuComponent menu = new Menu(MenuTest.MENU_NAME);
        menu.add(MenuTest.MENU_ITEM);
        final List<MenuComponent> components = Arrays.asList(menu, MenuTest.MENU_ITEM);
        Iterator<MenuComponent> iterator = new CompositeIterator(Arrays.asList(menu, MenuTest.MENU_ITEM));
        int index = 0;
        while (iterator.hasNext()) {
            Assert.assertEquals(components.get(index), iterator.next());
            index += 1;
        }
        Assert.assertEquals(2, index);
    }
}
