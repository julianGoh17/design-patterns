package io.patterns.factory;

import io.patterns.factory.pizza.Pizza;
import io.patterns.factory.pizza.stores.NormalPizzaStore;
import io.patterns.factory.pizza.stores.PizzaStore;
import org.junit.Assert;
import org.junit.Test;

public class PizzaStoreTest {
    @Test
    public void TestCreatePizza() {
        PizzaStore store = new NormalPizzaStore();
        Pizza pizza = store.createPizza();
        Assert.assertEquals(PizzaTest.NORMAL_PIZZA_DESCRIPTION, pizza.getDescription());
    }

    @Test
    public void TestOrderPizza() {
        PizzaStore store = new NormalPizzaStore();
        Pizza pizza = store.orderPizza();
        Assert.assertEquals(String.format("%s that has been baked, cut, and boxed", PizzaTest.NORMAL_PIZZA_DESCRIPTION), pizza.getDescription());
    }
}
