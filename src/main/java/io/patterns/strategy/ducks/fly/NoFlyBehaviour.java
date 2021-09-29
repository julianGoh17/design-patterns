package io.patterns.strategy.ducks.fly;

public class NoFlyBehaviour implements FlyBehaviour {
    @Override
    public boolean fly() {
        return false;
    }
}
