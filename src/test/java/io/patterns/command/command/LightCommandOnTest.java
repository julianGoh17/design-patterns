package io.patterns.command.command;

import io.patterns.command.receivers.Light;
import org.junit.Assert;
import org.junit.Test;

public class LightCommandOnTest {
    @Test
    public void TestExecuteCommand() {
        Light light = new Light();
        Command command = new LightOnCommand(light);
        command.execute();
        Assert.assertTrue(light.isEnabled());
    }

    @Test
    public void TestUndoCommand() {
        Light light = new Light();
        Command command = new LightOnCommand(light);
        command.execute();
        Assert.assertTrue(light.isEnabled());
        command.undo();
        Assert.assertFalse(light.isEnabled());
    }
}
