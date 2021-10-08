package io.patterns.visitor.items;


public class Dish implements Food {
    private final State state = new State(0, 0, 0);

    @Override
    public State getState() {
        return state;
    }

    @Override
    public void addIngredient(Food ingredient) {
        this.state.addComponent(ingredient);
        this.state.setCarbs(this.state.getCarbs() + ingredient.getState().getCarbs());
        this.state.setFats(this.state.getFats() + ingredient.getState().getFats());
        this.state.setProteins(this.state.getProteins() + ingredient.getState().getProteins());
    }
}
