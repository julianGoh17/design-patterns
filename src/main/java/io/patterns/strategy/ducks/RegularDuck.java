package io.patterns.strategy.ducks;

import io.patterns.strategy.ducks.fly.FlyWithWingsBehaviour;
import io.patterns.strategy.ducks.quack.LoudQuack;

public class RegularDuck extends Duck {
    public RegularDuck() {
        super(new FlyWithWingsBehaviour(), new LoudQuack());
    }
}
