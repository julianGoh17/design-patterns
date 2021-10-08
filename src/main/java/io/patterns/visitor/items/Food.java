package io.patterns.visitor.items;

public interface Food {
    State getState();

    void addIngredient(Food ingredient);
}
