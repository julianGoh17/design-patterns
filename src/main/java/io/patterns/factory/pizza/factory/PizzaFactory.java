package io.patterns.factory.pizza.factory;

import io.patterns.factory.ingredients.IngredientFactory;
import io.patterns.factory.pizza.Pizza;

public interface PizzaFactory {
    IngredientFactory getIngredients();
    Pizza createPizza();
}
