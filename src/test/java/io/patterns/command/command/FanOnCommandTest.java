package io.patterns.command.command;

import io.patterns.command.receivers.Fan;
import org.junit.Assert;
import org.junit.Test;

public class FanOnCommandTest {
    @Test
    public void TestExecute() {
        Fan fan = new Fan();
        FanOnCommand command = new FanOnCommand(fan);
        command.execute();
        Assert.assertTrue(fan.isEnabled());
        Assert.assertEquals(Fan.RUNNING_SPEED, fan.getSpeed());
    }

    @Test
    public void TestUndo() {
        Fan fan = new Fan();
        FanOnCommand command = new FanOnCommand(fan);
        command.execute();
        command.undo();
        Assert.assertFalse(fan.isEnabled());
        Assert.assertEquals(Fan.STOPPED_SPEED, fan.getSpeed());
    }
}
