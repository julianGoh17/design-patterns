package io.patterns.factory;

import io.patterns.factory.ingredients.IngredientFactory;
import io.patterns.factory.ingredients.NormalIngredientFactory;
import io.patterns.factory.pizza.Pizza;
import io.patterns.factory.pizza.factory.NormalPizzaFactory;
import io.patterns.factory.pizza.factory.PizzaFactory;
import org.junit.Assert;
import org.junit.Test;

public class PizzaFactoryTest {
    @Test
    public void TestPizzaStoreGetIngredients() {
        PizzaFactory store = new NormalPizzaFactory();
        IngredientFactory ingredientFactory = store.getIngredients();
        Assert.assertEquals(NormalIngredientFactory.MEAT, ingredientFactory.getMeat());
        Assert.assertEquals(NormalIngredientFactory.SAUCE, ingredientFactory.getSauce());
    }

    @Test
    public void TestPizzaCreatePizza() {
        PizzaFactory store = new NormalPizzaFactory();
        Pizza pizza = store.createPizza();
        Assert.assertEquals(String.format("Normal pizza with %s, %s", NormalIngredientFactory.MEAT, NormalIngredientFactory.SAUCE),
            pizza.getDescription());
    }
}
