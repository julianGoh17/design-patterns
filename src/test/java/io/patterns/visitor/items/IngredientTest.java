package io.patterns.visitor.items;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class IngredientTest {
    @Test
    public void TestIngredientImplementsFoodInterface() {
        Food ingredient = new Ingredient(10, 20, 30);
        Assert.assertNotNull(ingredient.getState());
        Assert.assertEquals(10, ingredient.getState().getCarbs());
        Assert.assertEquals(20, ingredient.getState().getFats());
        Assert.assertEquals(30, ingredient.getState().getProteins());
    }

    @Test
    public void TestAddComponentDoesNothing() {
        Food ingredient = new Ingredient(10, 20, 30);
        ingredient.addIngredient(ingredient);
        Assert.assertEquals(0, ingredient.getState().getComponents().size());
    }
}
