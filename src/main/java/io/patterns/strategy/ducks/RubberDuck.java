package io.patterns.strategy.ducks;

import io.patterns.strategy.ducks.flyable.FlyBehaviour;
import io.patterns.strategy.ducks.flyable.NoFlyBehaviour;
import io.patterns.strategy.ducks.quack.SilentQuack;

public class RubberDuck extends Duck {
    public RubberDuck() {
        super(new NoFlyBehaviour(), new SilentQuack());
    }
}
