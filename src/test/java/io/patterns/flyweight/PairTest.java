package io.patterns.flyweight;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class PairTest {
    @Test
    public void TestPair() {
        Pair<String, Integer> pair = new Pair<>("This", 5);
        Assert.assertEquals("This", pair.getLeft());
        Assert.assertEquals(5, pair.getRight().intValue());
    }
}
