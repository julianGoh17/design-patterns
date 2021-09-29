package io.patterns.strategy.ducks.quack;

public class SilentQuack implements QuackBehaviour {
    @Override
    public boolean quack() {
        return false;
    }
}
