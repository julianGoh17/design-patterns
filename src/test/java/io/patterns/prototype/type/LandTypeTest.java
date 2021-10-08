package io.patterns.prototype.type;

import io.patterns.mediator.type.LandType;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class LandTypeTest {
    @Test
    public void TestToString() {
        Assert.assertEquals("land", LandType.LAND.toString());
        Assert.assertEquals("sea", LandType.SEA.toString());
        Assert.assertEquals("air", LandType.AIR.toString());
    }
}
