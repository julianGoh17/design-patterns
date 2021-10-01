package io.patterns.iterator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class IteratorTest {
    private static final MenuItem FISH_AND_CHIPS = new MenuItem("Fish and chips", 3.50);
    private static final MenuItem STEAK_AND_EGGS = new MenuItem("Steak and Eggs", 8.60);

    private static final List<MenuItem> EXAMPLE = Arrays.asList(FISH_AND_CHIPS, STEAK_AND_EGGS);

    @Test
    public void TestArrayListIterator() {
        Iterator<MenuItem> iterator = new ListIterator<>(initializeList());
        assertIteratorCorrectness(iterator);
    }

    @Test
    public void TestArrayIterator() {
        Iterator<MenuItem> iterator = new ArrayIterator<>(initializeArray());
        assertIteratorCorrectness(iterator);
    }

    private void assertIteratorCorrectness(Iterator<MenuItem> iterator) {
        int index = 0;
        while (index < EXAMPLE.size()) {
            Assert.assertTrue(iterator.hasNext());
            Assert.assertEquals(EXAMPLE.get(index), iterator.next());
            index += 1;
        }
        Assert.assertFalse(iterator.hasNext());
    }

    private List<MenuItem> initializeList() {
        return EXAMPLE;
    }

    private MenuItem[] initializeArray() {
        MenuItem[] array = new MenuItem[EXAMPLE.size()];
        return EXAMPLE.toArray(array);
    }
}
