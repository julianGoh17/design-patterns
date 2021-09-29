package io.patterns.strategy.ducks.fly;

public class FlyWithWingsBehaviour implements FlyBehaviour {
    @Override
    public boolean fly() {
        return true;
    }
}
