package io.patterns.strategy.ducks;

import io.patterns.strategy.ducks.fly.NoFlyBehaviour;
import io.patterns.strategy.ducks.quack.SilentQuack;

public class RubberDuck extends Duck {
    public RubberDuck() {
        super(new NoFlyBehaviour(), new SilentQuack());
    }
}
