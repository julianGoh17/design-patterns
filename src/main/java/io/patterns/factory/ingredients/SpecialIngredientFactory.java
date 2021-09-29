package io.patterns.factory.ingredients;

public class SpecialIngredientFactory implements IngredientFactory {
    public static final String MEAT = "Fish";
    public static final String SAUCE = "Tartar Sauce";

    @Override
    public String getMeat() {
        return MEAT;
    }

    @Override
    public String getSauce() {
        return SAUCE;
    }
}
