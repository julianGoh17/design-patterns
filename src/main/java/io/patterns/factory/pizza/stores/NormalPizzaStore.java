package io.patterns.factory.pizza.stores;

import io.patterns.factory.ingredients.NormalIngredientFactory;
import io.patterns.factory.pizza.NormalPizza;
import io.patterns.factory.pizza.Pizza;

public class NormalPizzaStore extends PizzaStore {
    public NormalPizzaStore() {
        super(new NormalIngredientFactory());
    }

    @Override
    public Pizza createPizza() {
        return new NormalPizza(ingredients);
    }
}
