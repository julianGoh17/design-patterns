package io.patterns.template;

import java.util.ArrayList;
import java.util.Arrays;

public class DrinkContainer {
    private boolean isBoiled;
    private String contents;
    private boolean isFull;
    private final ArrayList<String> condiments;

    public DrinkContainer() {
        condiments = new ArrayList<>();
    }

    public boolean isBoiled() {
        return this.isBoiled;
    }

    public String getContents() {
        return this.contents;
    }

    public boolean isFull() {
        return this.isFull;
    }

    public ArrayList<String> getCondiments() {
        return this.condiments;
    }

    public void boil() {
        this.isBoiled = true;
    }

    public void addCondiments(String... condiments) {
        this.condiments.addAll(Arrays.asList(condiments));
    }

    public void addContents(String brew) {
        this.contents = brew;
        this.isFull = true;
    }
}
