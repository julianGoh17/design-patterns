package io.patterns.adapter;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class IteratorAdapterTest {
    public static final int SIZE = 5;

    @Test
    public void TestAdapterHasNext() {
        Enumerator<Integer> adapter = initializeIteratorAdapter();
        Assert.assertTrue(adapter.hasNext());

        for (int i = 0; i < SIZE - 1; i++) {
            adapter.next();
            Assert.assertTrue(adapter.hasNext());
        }

        adapter.next();
        Assert.assertFalse(adapter.hasNext());
    }

    @Test
    public void TestAdapterNext() {
        Enumerator<Integer> adapter = initializeIteratorAdapter();
        int target = 0;
        while (adapter.hasNext()) {
            Assert.assertEquals(target, adapter.next().intValue());
            target++;
        }
    }

    private Enumerator<Integer> initializeIteratorAdapter() {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < SIZE; i++) integers.add(i);
        return new IteratorAdapter<>(integers.iterator());
    }
}
