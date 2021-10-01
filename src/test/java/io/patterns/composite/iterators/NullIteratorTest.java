package io.patterns.composite.iterators;

import io.patterns.composite.MenuComponent;
import io.patterns.iterator.Iterator;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class NullIteratorTest {
    @Test
    public void TestNullIterator() {
        Iterator<MenuComponent> iterator = new NullIterator<>();
        Assert.assertNull(iterator.next());
        Assert.assertFalse(iterator.hasNext());
    }
}
