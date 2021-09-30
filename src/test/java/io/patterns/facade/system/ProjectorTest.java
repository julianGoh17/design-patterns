package io.patterns.facade.system;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ProjectorTest {
    public static final String DVD = "Rush Hour 3";

    @Test
    public void TestInit() {
        Projector projector = new Projector();
        Assert.assertNull(projector.getDvd());
        Assert.assertFalse(projector.isEnabled());
    }

    @Test
    public void TestSetter() {
        Projector projector = new Projector();
        projector.setDvd(DVD);
        projector.setEnabled(true);

        Assert.assertEquals(DVD, projector.getDvd());
        Assert.assertTrue(projector.isEnabled());
    }
}
