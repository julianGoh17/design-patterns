package io.patterns.strategy.ducks.quack;

public class LoudQuack implements QuackBehaviour {
    @Override
    public boolean quack() {
        return true;
    }
}
