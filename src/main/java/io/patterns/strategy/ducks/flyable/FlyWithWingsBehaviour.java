package io.patterns.strategy.ducks.flyable;

public class FlyWithWingsBehaviour implements FlyBehaviour {
    @Override
    public boolean fly() {
        return true;
    }
}
