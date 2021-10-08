package io.patterns.visitor.items;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class DishTest {
    @Test
    public void TestDishImplementsFoodInterface() {
        Food food = new Dish();
        Assert.assertEquals(0, food.getState().getCarbs());
        Assert.assertEquals(0, food.getState().getFats());
        Assert.assertEquals(0, food.getState().getProteins());
    }

    @Test
    public void TestDishCanAddIngredients() {
        Dish food = new Dish();
        food.addIngredient(new Ingredient(1, 2, 3));
        food.addIngredient(new Ingredient(1, 2, 3));
        Assert.assertEquals(2, food.getState().getComponents().size());
        Assert.assertEquals(2, food.getState().getCarbs());
        Assert.assertEquals(4, food.getState().getFats());
        Assert.assertEquals(6, food.getState().getProteins());
    }
}
