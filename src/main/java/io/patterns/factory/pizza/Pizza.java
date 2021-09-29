package io.patterns.factory.pizza;

import io.patterns.factory.ingredients.IngredientFactory;

public abstract class Pizza {
    protected String description;
    protected IngredientFactory ingredients;

    public Pizza(String description, IngredientFactory ingredients) {
        this.description = description;
        this.ingredients = ingredients;
    }

    public void addToDescription(String description) {
        this.description += description;
    }

    public void bake() {
        this.description += " that has been baked";
    }

    public void cut() {
        this.description += ", cut";
    }

    public void box() {
        this.description += ", and boxed";
    }

    public String getDescription() {
        return description;
    }
}
