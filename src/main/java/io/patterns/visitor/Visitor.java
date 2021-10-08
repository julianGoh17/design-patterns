package io.patterns.visitor;

import io.patterns.flyweight.Pair;
import io.patterns.visitor.items.Food;
import io.patterns.visitor.items.State;

import java.util.Stack;

public class Visitor {
    private final Stack<Pair<Food, Integer>> foods;

    public Visitor(Food root) {
        this.foods = new Stack<>();
        this.foods.push(new Pair<>(root, 0));
        traverseLeftTree();
    }

    public int getCarbs() {
        return getLastFoodState().getCarbs();
    }

    public int getFats() {
        return getLastFoodState().getFats();
    }

    private State getLastFoodState() {
        return this.foods.lastElement().getLeft().getState();
    }

    public int getProteins() {
        return getLastFoodState().getProteins();
    }

    public int getCalories() {
        return 4 * getCarbs() + 4 * getProteins() + 9 * getFats();
    }

    public void next() {
        this.foods.lastElement().setRight(this.foods.lastElement().getRight() + 1);
        popEmptyNodes();
        if (hasFoods()) {
            traverseLeftTree();
        }
    }

    public boolean hasFoods() {
        return foods.size() > 0;
    }

    private void popEmptyNodes() {
        if (hasFoods() && !pairHasChildren(this.foods.lastElement())) {
            this.foods.pop();
        }
    }

    private void traverseLeftTree() {
        while (pairHasChildren(this.foods.lastElement())) {
            Pair<Food, Integer> pair = new Pair<>(this.foods.lastElement().getLeft().getState().getComponents().get(this.foods.lastElement().getRight()), 0);
            this.foods.lastElement().setRight(this.foods.lastElement().getRight() + 1);
            this.foods.push(pair);
        }
    }

    private boolean pairHasChildren(Pair<Food, Integer> pair) {
        return pair.getRight() < pair.getLeft().getState().getComponents().size();
    }
}
