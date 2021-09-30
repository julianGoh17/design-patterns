package io.patterns.template.drinks;

import io.patterns.template.DrinkContainer;

public abstract class Drink {
    protected final DrinkContainer container;

    public Drink(DrinkContainer container) {
        this.container = container;
    }

    public final void prepare() {
        boil();
        addContents();
        addCondiments();
    }

    public void boil() {
        this.container.boil();
    }

    public void addContents() { }

    public void addCondiments() { }
}
