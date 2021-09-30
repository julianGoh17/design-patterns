package io.patterns.factory.pizza.stores;

import io.patterns.factory.ingredients.IngredientFactory;
import io.patterns.factory.pizza.Pizza;

public abstract class PizzaStore {
    protected IngredientFactory ingredients;

    public PizzaStore(IngredientFactory ingredients) {
        this.ingredients = ingredients;
    }

    public final Pizza orderPizza() {
        Pizza pizza = createPizza();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza createPizza();
}
