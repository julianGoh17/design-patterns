package io.patterns.strategy.fly;

public class NoFlyBehaviour implements FlyBehaviour {
    @Override
    public boolean fly() {
        return false;
    }
}
