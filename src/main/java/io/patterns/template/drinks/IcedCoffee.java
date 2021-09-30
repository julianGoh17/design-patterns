package io.patterns.template.drinks;

import io.patterns.template.DrinkContainer;

public class IcedCoffee extends Drink {
    public static final String DRINK_TYPE = "Coffee";
    public IcedCoffee(DrinkContainer container) {
        super(container);
    }

    @Override
    public void boil() { }

    @Override
    public void addCondiments() {
        super.addCondiments();
        container.addCondiments("Ice");
    }

    @Override
    public void addContents() {
        super.addContents();
        container.addContents(DRINK_TYPE);
    }
}
