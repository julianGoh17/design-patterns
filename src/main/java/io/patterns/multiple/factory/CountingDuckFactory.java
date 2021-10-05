package io.patterns.multiple.factory;

import io.patterns.multiple.adapters.Geese;
import io.patterns.multiple.adapters.GeeseAdapter;
import io.patterns.multiple.decorators.DuckCounter;
import io.patterns.multiple.duck.Duck;
import io.patterns.multiple.duck.MallardDuck;
import io.patterns.multiple.duck.RedHeadDuck;
import io.patterns.multiple.duck.RubberDuck;

public class CountingDuckFactory implements DuckFactory {
    @Override
    public Duck getMallardDuck() {
        return new DuckCounter(new MallardDuck());
    }

    @Override
    public Duck getRubberDuck() {
        return new DuckCounter(new RubberDuck());
    }

    @Override
    public Duck getRedHeadDuck() {
        return new DuckCounter(new RedHeadDuck());
    }

    @Override
    public Duck getGeese() {
        return new GeeseAdapter(new Geese());
    }
}
