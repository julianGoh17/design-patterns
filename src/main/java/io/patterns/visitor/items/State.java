package io.patterns.visitor.items;

import java.util.ArrayList;
import java.util.List;

public class State {
    private int carbs;
    private int fats;
    private int proteins;
    private final List<Food> components;

    public State(int carbs, int fats, int proteins) {
        this.carbs = carbs;
        this.fats = fats;
        this.proteins = proteins;
        this.components = new ArrayList<>();
    }

    public int getCarbs() {
        return carbs;
    }

    public int getFats() {
        return fats;
    }

    public int getProteins() {
        return proteins;
    }

    public void setCarbs(int carbs) {
        this.carbs = carbs;
    }

    public void setFats(int fats) {
        this.fats = fats;
    }

    public void setProteins(int proteins) {
        this.proteins = proteins;
    }

    public List<Food> getComponents() {
        return this.components;
    }

    public void addComponent(Food component) {
        this.components.add(component);
    }
}
