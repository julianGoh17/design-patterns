package io.patterns.multiple.decorators;

import io.patterns.multiple.duck.Duck;

public class DuckCounter implements Duck {
    private final Duck duck;
    private static int quacks;

    public DuckCounter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public String quack() {
        quacks += 1;
        return this.duck.quack();
    }

    public static int getQuacks() {
        return quacks;
    }

    public Duck getDuck() {
        return this.duck;
    }

    public static void reset() {
        quacks = 0;
    }
}
