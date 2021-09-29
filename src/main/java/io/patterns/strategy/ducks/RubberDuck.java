package io.patterns.strategy.ducks;

import io.patterns.strategy.fly.NoFlyBehaviour;
import io.patterns.strategy.quack.SilentQuack;

public class RubberDuck extends Duck {
    public RubberDuck() {
        super(new NoFlyBehaviour(), new SilentQuack());
    }
}
