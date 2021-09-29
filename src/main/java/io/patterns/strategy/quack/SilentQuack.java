package io.patterns.strategy.quack;

public class SilentQuack implements QuackBehaviour {
    @Override
    public boolean quack() {
        return false;
    }
}
