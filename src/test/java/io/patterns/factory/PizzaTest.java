package io.patterns.factory;

import io.patterns.factory.ingredients.NormalIngredientFactory;
import io.patterns.factory.ingredients.SpecialIngredientFactory;
import io.patterns.factory.pizza.NormalPizza;
import io.patterns.factory.pizza.Pizza;
import io.patterns.factory.pizza.SpecialPizza;
import org.junit.Assert;
import org.junit.Test;

public class PizzaTest {
    public final static String NORMAL_PIZZA_DESCRIPTION = "Normal pizza with Pepperoni, Tomato Sauce";
    public final static String SPECIAL_PIZZA_DESCRIPTION = "Special pizza with Fish, Tartar Sauce";

    @Test
    public void TestCreateNormalPizza() {
        Pizza pizza = new NormalPizza(new NormalIngredientFactory());
        Assert.assertEquals(NORMAL_PIZZA_DESCRIPTION, pizza.getDescription());
    }

    @Test
    public void TestCreateSpecialPizza() {
        Pizza pizza = new SpecialPizza(new SpecialIngredientFactory());
        Assert.assertEquals(SPECIAL_PIZZA_DESCRIPTION, pizza.getDescription());
    }

    @Test
    public void TestAddDescription() {
        String description = " with description";
        Pizza pizza = new NormalPizza(new NormalIngredientFactory());
        pizza.addToDescription(description);
        Assert.assertEquals(String.format("%s with description", NORMAL_PIZZA_DESCRIPTION), pizza.getDescription());
    }

    @Test
    public void TestBakePizza() {
        Pizza pizza = new NormalPizza(new NormalIngredientFactory());
        pizza.bake();
        Assert.assertEquals(String.format("%s that has been baked", NORMAL_PIZZA_DESCRIPTION), pizza.getDescription());
    }

    @Test
    public void TestCutPizza() {
        Pizza pizza = new NormalPizza(new NormalIngredientFactory());
        pizza.cut();
        Assert.assertEquals(String.format("%s, cut", NORMAL_PIZZA_DESCRIPTION), pizza.getDescription());
    }

    @Test
    public void TestBoxPizza() {
        Pizza pizza = new NormalPizza(new NormalIngredientFactory());
        pizza.box();
        Assert.assertEquals(String.format("%s, and boxed", NORMAL_PIZZA_DESCRIPTION), pizza.getDescription());
    }
}
