package io.patterns.strategy.ducks;

import io.patterns.strategy.fly.FlyWithWingsBehaviour;
import io.patterns.strategy.quack.LoudQuack;

public class RegularDuck extends Duck {
    public RegularDuck() {
        super(new FlyWithWingsBehaviour(), new LoudQuack());
    }
}
