package io.patterns.bridge;

import io.patterns.bridge.control.RemoteControl;
import io.patterns.bridge.control.SmallRemoteControl;
import io.patterns.bridge.tv.SonyTelevision;
import io.patterns.bridge.tv.Television;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class RemoteControlTest {
    @Test
    public void TestRemoteControl() {
        Television television = new SonyTelevision();
        RemoteControl control = new SmallRemoteControl(television);
        control.on();
        Assert.assertTrue(television.isEnabled());

        control.off();
        Assert.assertFalse(television.isEnabled());

        control.setChannel(10);
        Assert.assertEquals(10, television.getChannel());
    }

    @Test
    public void TestIncrementChannel() {
        Television television = new SonyTelevision();
        SmallRemoteControl control = new SmallRemoteControl(television);
        control.incrementChannel();
        Assert.assertEquals(1, television.getChannel());
    }
}
