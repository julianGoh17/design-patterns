package io.patterns.factory.pizza.stores;

import io.patterns.factory.ingredients.SpecialIngredientFactory;
import io.patterns.factory.pizza.Pizza;
import io.patterns.factory.pizza.SpecialPizza;

public class SpecialPizzaStore extends PizzaStore {
    public SpecialPizzaStore() {
        super(new SpecialIngredientFactory());
    }

    @Override
    public Pizza createPizza() {
        return new SpecialPizza(ingredients);
    }
}
