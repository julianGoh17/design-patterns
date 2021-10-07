package io.patterns.interpreter.runner;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class DirectionTest {
    @Test
    public void TestToString() {
        Assert.assertEquals("north", Direction.NORTH.toString());
        Assert.assertEquals("east", Direction.EAST.toString());
        Assert.assertEquals("south", Direction.SOUTH.toString());
        Assert.assertEquals("west", Direction.WEST.toString());
    }
}
