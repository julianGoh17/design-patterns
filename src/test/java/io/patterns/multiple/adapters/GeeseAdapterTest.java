package io.patterns.multiple.adapters;

import io.patterns.multiple.duck.Duck;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class GeeseAdapterTest {
    @Test
    public void TestGeeseAdapter() {
        Duck duck = new GeeseAdapter(new Geese());
        Assert.assertEquals("Honk", duck.quack());
    }

    @Test
    public void TestGeese() {
        Geese geese = new Geese();
        Assert.assertEquals("Honk", geese.honk());
    }
}
