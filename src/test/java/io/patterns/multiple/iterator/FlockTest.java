package io.patterns.multiple.iterator;

import io.patterns.multiple.decorators.DuckCounter;
import io.patterns.multiple.duck.Duck;
import io.patterns.multiple.duck.MallardDuck;
import io.patterns.multiple.duck.RubberDuck;
import io.patterns.multiple.factory.CountingDuckFactory;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FlockTest {
    @Test
    public void TestInitialization() {
        Flock flock = new Flock();
        Assert.assertEquals(0, flock.getDucks().size());
    }

    @Test
    public void TestAddDucks() {
        Flock flock = new Flock();
        flock.add(new MallardDuck());
        Assert.assertEquals(1, flock.getDucks().size());
    }

    @Test
    public void TestIterator() {
        List<Duck> ducks = Arrays.asList(new MallardDuck(), new RubberDuck());
        Flock flock = new Flock();
        ducks.forEach(flock::add);
        Assert.assertEquals(2, flock.getDucks().size());

        Iterator<Duck> iterator = flock.toIterator();
        ducks.forEach(duck -> {
            Assert.assertTrue(iterator.hasNext());
            Assert.assertEquals(duck, iterator.next());
        });
        Assert.assertFalse(iterator.hasNext());
    }

    @Test
    public void TestQuacks() {
        DuckCounter.reset();
        CountingDuckFactory factory = new CountingDuckFactory();
        List<Duck> ducks = Arrays.asList(factory.getMallardDuck(), factory.getRubberDuck());
        Flock flock = new Flock();
        ducks.forEach(flock::add);

        Assert.assertEquals("Flock", flock.quack());
        Assert.assertEquals(ducks.size(), DuckCounter.getQuacks());
    }
}
