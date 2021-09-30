package io.patterns.adapter;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class EnumeratorTest {
    public static final int SIZE = 5;

    @Test
    public void TestHasNext() {
        Enumerator<Integer> enumerator = initializeEnumerator();
        Assert.assertTrue(enumerator.hasNext());

        for (int i=0; i < SIZE - 1; i++) {
            enumerator.next();
            Assert.assertTrue(enumerator.hasNext());
        }

        enumerator.next();
        Assert.assertFalse(enumerator.hasNext());
    }

    @Test
    public void TestNext() {
        Enumerator<Integer> enumerator = initializeEnumerator();
        int target = 0;
        while (enumerator.hasNext()) {
            Assert.assertEquals(target, enumerator.next().intValue());
            target++;
        }
    }

    private Enumerator<Integer> initializeEnumerator() {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i=0; i < SIZE; i++) integers.add(i);
        return createEnumerator(integers);
    }

    private <T> Enumerator<T> createEnumerator(ArrayList<T> list) {
        return new ArrayListEnumerator<T>(list);
    }
}
