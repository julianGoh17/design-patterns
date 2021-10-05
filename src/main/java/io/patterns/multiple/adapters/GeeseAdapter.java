package io.patterns.multiple.adapters;

import io.patterns.multiple.duck.Duck;

public class GeeseAdapter implements Duck {
    private final Geese geese;

    public GeeseAdapter(Geese geese) {
        this.geese = geese;
    }

    @Override
    public String quack() {
        return this.geese.honk();
    }
}
