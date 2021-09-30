package io.patterns.factory;

import io.patterns.factory.ingredients.IngredientFactory;
import io.patterns.factory.ingredients.NormalIngredientFactory;
import io.patterns.factory.ingredients.SpecialIngredientFactory;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class IngredientFactoryTest {
    @Test
    public void TestNormalIngredientFactory() {
        IngredientFactory factory = new NormalIngredientFactory();
        Assert.assertEquals("Pepperoni", factory.getMeat());
        Assert.assertEquals("Tomato Sauce", factory.getSauce());
    }

    @Test
    public void TestSpecialIngredientFactory() {
        IngredientFactory factory = new SpecialIngredientFactory();
        Assert.assertEquals("Fish", factory.getMeat());
        Assert.assertEquals("Tartar Sauce", factory.getSauce());
    }
}
