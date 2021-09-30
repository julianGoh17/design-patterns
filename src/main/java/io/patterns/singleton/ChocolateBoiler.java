package io.patterns.singleton;

import java.util.Optional;

public class ChocolateBoiler {
    private boolean isFilled;
    private boolean isBoiled;

    private static ChocolateBoiler instance;

    private ChocolateBoiler() {
        isFilled = false;
        isBoiled = false;
    }

    public static ChocolateBoiler instantiate() {
        instance = Optional.ofNullable(instance).orElse(new ChocolateBoiler());
        return instance;
    }

    public void fill() {
        if (!isFilled) {
            isFilled = true;
        }
    }

    public void prepare() {
        if (isFilled) {
            isBoiled = true;
        }
    }

    public static void reset() {
        instance = null;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public boolean isBoiled() {
        return isBoiled;
    }
}
