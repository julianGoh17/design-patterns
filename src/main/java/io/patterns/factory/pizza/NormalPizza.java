package io.patterns.factory.pizza;

import io.patterns.factory.ingredients.IngredientFactory;

public class NormalPizza extends Pizza {
    public NormalPizza(IngredientFactory ingredients) {
        super("Normal pizza", ingredients);
    }
}
