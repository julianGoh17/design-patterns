package io.patterns.factory;

import io.patterns.factory.pizza.Pizza;
import io.patterns.factory.pizza.stores.NormalPizzaStore;
import io.patterns.factory.pizza.stores.PizzaStore;
import io.patterns.factory.pizza.stores.SpecialPizzaStore;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class PizzaStoreTest {
    @Test
    public void TestCreateNormalPizza() {
        PizzaStore store = new NormalPizzaStore();
        Pizza pizza = store.createPizza();
        Assert.assertEquals(PizzaTest.NORMAL_PIZZA_DESCRIPTION, pizza.getDescription());
    }

    @Test
    public void TestOrderNormalPizza() {
        PizzaStore store = new NormalPizzaStore();
        Pizza pizza = store.orderPizza();
        Assert.assertEquals(String.format("%s that has been baked, cut, and boxed", PizzaTest.NORMAL_PIZZA_DESCRIPTION), pizza.getDescription());
    }

    @Test
    public void TestCreateSpecialPizza() {
        PizzaStore store = new SpecialPizzaStore();
        Pizza pizza = store.createPizza();
        Assert.assertEquals(PizzaTest.SPECIAL_PIZZA_DESCRIPTION, pizza.getDescription());
    }

    @Test
    public void TestOrderSpecialPizza() {
        PizzaStore store = new SpecialPizzaStore();
        Pizza pizza = store.orderPizza();
        Assert.assertEquals(String.format("%s that has been baked, cut, and boxed", PizzaTest.SPECIAL_PIZZA_DESCRIPTION), pizza.getDescription());
    }
}
