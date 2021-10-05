package io.patterns.multiple.observer;

public class Researcher implements QuackingObserver {
    private int seenQuacks = 0;

    @Override
    public void update(ObservableDuck duck) {
        this.seenQuacks += 1;
    }

    public int getSeenQuacks() {
        return this.seenQuacks;
    }
}
