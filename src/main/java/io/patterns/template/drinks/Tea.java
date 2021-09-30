package io.patterns.template.drinks;

import io.patterns.template.DrinkContainer;

public class Tea extends Drink {
    public final String DRINK_TYPE = "Tea";

    public Tea(DrinkContainer container) {
        super(container);
    }

    @Override
    public void addContents() {
        super.addContents();
        container.addContents(DRINK_TYPE);
    }

    @Override
    public void addCondiments() {
        super.addCondiments();
        container.addCondiments("Lemon");
    }
}
