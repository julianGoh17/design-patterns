package io.patterns.flyweight;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TreeTest {
    @Test
    public void TestDisplay() {
        Assert.assertEquals("(5,5)", Tree.display(5, 5));
    }
}
