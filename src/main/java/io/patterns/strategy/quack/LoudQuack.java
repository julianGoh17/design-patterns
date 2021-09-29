package io.patterns.strategy.quack;

public class LoudQuack implements QuackBehaviour {
    @Override
    public boolean quack() {
        return true;
    }
}
