package io.patterns.multiple.factory;

import io.patterns.multiple.decorators.DuckCounter;
import io.patterns.multiple.duck.Duck;
import io.patterns.multiple.duck.MallardDuck;
import io.patterns.multiple.duck.RedHeadDuck;
import io.patterns.multiple.duck.RubberDuck;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CountingDuckFactoryTest {
    @Test
    public void TestCountingDuckFactory() {
        DuckFactory factory = new CountingDuckFactory();
        Duck mallardDuck = factory.getMallardDuck();
        assertCounterIsClass(mallardDuck, MallardDuck.class);
        Duck rubberDuck = factory.getRubberDuck();
        assertCounterIsClass(rubberDuck, RubberDuck.class);
        Duck redHead = factory.getRedHeadDuck();
        assertCounterIsClass(redHead, RedHeadDuck.class);
        factory.getGeese();
    }

    @Test
    public void TestGetQuacks() {
        DuckCounter.reset();
        DuckFactory factory = new CountingDuckFactory();
        Duck mallardDuck = factory.getMallardDuck();
        Duck rubberDuck = factory.getRubberDuck();
        Duck redHead = factory.getRedHeadDuck();
        Duck geese = factory.getGeese();

        mallardDuck.quack();
        Assert.assertEquals(1, DuckCounter.getQuacks());

        rubberDuck.quack();
        Assert.assertEquals(2, DuckCounter.getQuacks());

        redHead.quack();
        Assert.assertEquals(3, DuckCounter.getQuacks());

        geese.quack();
        Assert.assertEquals(3, DuckCounter.getQuacks());
    }

    private <T> void assertCounterIsClass(Duck duck, Class<T> objectClass) {
        DuckCounter counter = (DuckCounter) duck;
        Assert.assertEquals(objectClass, counter.getDuck().getClass());
    }
}
