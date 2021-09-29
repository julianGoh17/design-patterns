package io.patterns.factory;

import io.patterns.factory.ingredients.IngredientFactory;
import io.patterns.factory.ingredients.NormalIngredientFactory;
import org.junit.Assert;
import org.junit.Test;

public class IngredientFactoryTest {
    @Test
    public void TestNormalIngredientFactory() {
        IngredientFactory factory = new NormalIngredientFactory();
        Assert.assertEquals("Pepperoni", factory.getMeat());
        Assert.assertEquals("Tomato Sauce", factory.getSauce());
    }
}
