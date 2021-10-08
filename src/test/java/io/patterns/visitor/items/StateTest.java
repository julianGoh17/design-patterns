package io.patterns.visitor.items;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class StateTest {
    private final int carbs = 10;
    private final int fats = 20;
    private final int proteins = 30;

    @Test
    public void TestStateGetters() {
        State state = new State(carbs, fats, proteins);

        AssertStateVariables(state);
    }

    @Test
    public void TestSetters() {
        State state = new State(0, 0, 0);
        state.setCarbs(carbs);
        state.setFats(fats);
        state.setProteins(proteins);

        AssertStateVariables(state);
    }

    @Test
    public void TestAddComponent() {
        State state = new State(0, 0, 0);
        state.addComponent(new Ingredient(0, 0,0));
        Assert.assertEquals(1, state.getComponents().size());
    }

    private void AssertStateVariables(State state) {
        Assert.assertEquals(carbs, state.getCarbs());
        Assert.assertEquals(fats, state.getFats());
        Assert.assertEquals(proteins, state.getProteins());
        Assert.assertEquals(0, state.getComponents().size());
    }
}
