package io.patterns.flyweight;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TreeManagerTest {
    @Test
    public void TestInitialization() {
        TreeManager manager = new TreeManager();
        Assert.assertEquals(0, manager.getTrees().size());
    }

    @Test
    public void TestAddTree() {
        TreeManager manager = new TreeManager();
        manager.addTree(1, 5);
        Assert.assertEquals(1, manager.getTrees().size());
        Assert.assertEquals(1, manager.getTrees().get(0).getLeft().intValue());
        Assert.assertEquals(5, manager.getTrees().get(0).getRight().intValue());
    }

    @Test
    public void TestDisplay() {
        TreeManager manager = new TreeManager();
        manager.addTree(1, 5);
        manager.addTree(5, 1);
        List<String> displayedTrees = manager.display();
        Assert.assertEquals(2, displayedTrees.size());
        Assert.assertEquals("(1,5)", displayedTrees.get(0));
        Assert.assertEquals("(5,1)", displayedTrees.get(1));
    }
}
