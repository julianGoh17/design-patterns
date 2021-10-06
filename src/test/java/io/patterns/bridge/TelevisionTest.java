package io.patterns.bridge;

import io.patterns.bridge.tv.SonyTelevision;
import io.patterns.bridge.tv.Television;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TelevisionTest {
    @Test
    public void TestTelevisionInterface() {
        Television tv = new SonyTelevision();
        Assert.assertEquals(0, tv.getChannel());
        Assert.assertFalse(tv.isEnabled());

        tv.changeChannelTo(10);
        tv.setEnabled(true);
        Assert.assertEquals(10, tv.getChannel());
        Assert.assertTrue(tv.isEnabled());
    }
}
