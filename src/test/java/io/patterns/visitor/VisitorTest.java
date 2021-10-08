package io.patterns.visitor;

import io.patterns.visitor.items.Dish;
import io.patterns.visitor.items.Food;
import io.patterns.visitor.items.Ingredient;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class VisitorTest {
    private final static Food firstIngredient = new Ingredient(0, 1, 2);
    private final static Food secondIngredient = new Ingredient(3, 4, 5);

    @Test
    public void TestVisitorOnIngredient() {
        Visitor visitor = new Visitor(firstIngredient);
        Assert.assertEquals(firstIngredient.getState().getCarbs(), visitor.getCarbs());
        Assert.assertEquals(firstIngredient.getState().getFats(), visitor.getFats());
        Assert.assertEquals(firstIngredient.getState().getProteins(), visitor.getProteins());
        Assert.assertEquals(17, visitor.getCalories());

        visitor.next();
        Assert.assertFalse(visitor.hasFoods());
    }

    @Test
    public void TestNestedObject() {
        Food dish = new Dish();
        dish.addIngredient(firstIngredient);
        dish.addIngredient(secondIngredient);
        Visitor visitor = new Visitor(dish);

        Assert.assertEquals(firstIngredient.getState().getCarbs(), visitor.getCarbs());
        Assert.assertEquals(firstIngredient.getState().getFats(), visitor.getFats());
        Assert.assertEquals(firstIngredient.getState().getProteins(), visitor.getProteins());
        Assert.assertEquals(17, visitor.getCalories());

        visitor.next();
        Assert.assertEquals(secondIngredient.getState().getCarbs(), visitor.getCarbs());
        Assert.assertEquals(secondIngredient.getState().getFats(), visitor.getFats());
        Assert.assertEquals(secondIngredient.getState().getProteins(), visitor.getProteins());
        Assert.assertEquals(68, visitor.getCalories());

        visitor.next();
        Assert.assertEquals(firstIngredient.getState().getCarbs() + secondIngredient.getState().getCarbs(), visitor.getCarbs());
        Assert.assertEquals(firstIngredient.getState().getFats() + secondIngredient.getState().getFats(), visitor.getFats());
        Assert.assertEquals(firstIngredient.getState().getProteins() + secondIngredient.getState().getProteins(), visitor.getProteins());
        Assert.assertEquals(85, visitor.getCalories());


        visitor.next();
        Assert.assertFalse(visitor.hasFoods());
    }
}
