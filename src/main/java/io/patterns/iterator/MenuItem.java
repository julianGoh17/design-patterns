package io.patterns.iterator;

public class MenuItem {
    private final String name;
    private final double cost;

    public MenuItem(String itemName, double itemCost) {
        this.name = itemName;
        this.cost = itemCost;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }
}
