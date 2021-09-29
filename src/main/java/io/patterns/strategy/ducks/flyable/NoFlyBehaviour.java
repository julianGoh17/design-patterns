package io.patterns.strategy.ducks.flyable;

public class NoFlyBehaviour implements FlyBehaviour {
    @Override
    public boolean fly() {
        return false;
    }
}
