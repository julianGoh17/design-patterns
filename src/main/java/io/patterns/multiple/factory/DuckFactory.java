package io.patterns.multiple.factory;

import io.patterns.multiple.duck.Duck;

public interface DuckFactory {

    Duck getMallardDuck();

    Duck getRubberDuck();

    Duck getRedHeadDuck();

    Duck getGeese();
}
