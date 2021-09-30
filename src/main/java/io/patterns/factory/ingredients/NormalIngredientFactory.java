package io.patterns.factory.ingredients;

public class NormalIngredientFactory implements IngredientFactory {
    public static final String MEAT = "Pepperoni";
    public static final String SAUCE = "Tomato Sauce";

    @Override
    public String getMeat() {
        return MEAT;
    }

    @Override
    public String getSauce() {
        return SAUCE;
    }
}
