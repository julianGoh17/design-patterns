package io.patterns.factory.pizza.factory;

import io.patterns.factory.ingredients.IngredientFactory;
import io.patterns.factory.ingredients.NormalIngredientFactory;
import io.patterns.factory.pizza.NormalPizza;
import io.patterns.factory.pizza.Pizza;

public class NormalPizzaFactory implements PizzaFactory {
    private final IngredientFactory ingredients = new NormalIngredientFactory();

    @Override
    public IngredientFactory getIngredients() {
        return ingredients;
    }

    @Override
    public Pizza createPizza() {
        return new NormalPizza(getIngredients());
    }
}
