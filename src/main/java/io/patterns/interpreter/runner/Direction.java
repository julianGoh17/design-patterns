package io.patterns.interpreter.runner;

public enum Direction {
    NORTH("north"),
    EAST("east"),
    SOUTH("south"),
    WEST("west");

    private final String direction;

    Direction(String direction) {
        this.direction = direction;
    }

    public String toString() {
        return this.direction;
    }
}
