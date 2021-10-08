package io.patterns.visitor.items;

public class Ingredient implements Food {
    private final State state;

    public Ingredient(int carbs, int fats, int proteins) {
        this.state = new State(carbs, fats, proteins);
    }

    @Override
    public State getState() {
        return state;
    }

    @Override
    public void addIngredient(Food ingredient) { }
}
