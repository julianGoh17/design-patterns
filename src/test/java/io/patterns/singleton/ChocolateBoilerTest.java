package io.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class ChocolateBoilerTest {
    @Test
    public void TestInstantiate() {
        ChocolateBoiler.reset();
        ChocolateBoiler boiler = ChocolateBoiler.instantiate();
        Assert.assertNotNull(boiler);
        Assert.assertFalse(boiler.isFilled());
        Assert.assertFalse(boiler.isBoiled());
    }

    @Test
    public void TestChocolateBoilerDoesNotCreateNewObject() {
        ChocolateBoiler.reset();
        ChocolateBoiler original = ChocolateBoiler.instantiate();
        ChocolateBoiler copy = ChocolateBoiler.instantiate();
        Assert.assertEquals(original, copy);
    }

    @Test
    public void TestChocolateBoilerFill() {
        ChocolateBoiler.reset();
        ChocolateBoiler boiler = ChocolateBoiler.instantiate();
        boiler.fill();
        Assert.assertTrue(boiler.isFilled());
    }

    @Test
    public void TestChocolateBoilerPrepare() {
        ChocolateBoiler.reset();
        ChocolateBoiler boiler = ChocolateBoiler.instantiate();
        boiler.prepare();
        Assert.assertFalse(boiler.isFilled());
        Assert.assertFalse(boiler.isBoiled());

        boiler.fill();
        boiler.prepare();
        Assert.assertTrue(boiler.isFilled());
        Assert.assertTrue(boiler.isBoiled());
    }

    @Test
    public void TestChocolateBoilerReset() {
        ChocolateBoiler boiler = ChocolateBoiler.instantiate();
        Assert.assertNotNull(boiler);
        ChocolateBoiler.reset();
        Assert.assertNotEquals(boiler, ChocolateBoiler.instantiate());
    }
}
