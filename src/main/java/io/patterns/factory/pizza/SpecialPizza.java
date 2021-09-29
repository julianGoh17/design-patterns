package io.patterns.factory.pizza;

import io.patterns.factory.ingredients.IngredientFactory;

public class SpecialPizza extends Pizza {
    public SpecialPizza(IngredientFactory ingredients) {
        super("Special pizza", ingredients);
    }
}
