package io.patterns.command.components;

import io.patterns.command.command.Command;
import io.patterns.command.command.FanOnCommand;
import io.patterns.command.command.LightOnCommand;
import io.patterns.command.command.NoCommand;
import io.patterns.command.receivers.Fan;
import io.patterns.command.receivers.Light;
import org.junit.Assert;
import org.junit.Test;

public class InvokerTest {
    @Test
    public void TestInitInvoker() {
        Invoker invoker = new Invoker();
        Assert.assertEquals(Invoker.NUM_COMMANDS, invoker.getCommands().size());
        AssertInvokerHasOnlyNoCommands(invoker);
    }

    @Test
    public void TestSetCommand() {
        Invoker invoker = new Invoker();
        Command command = new LightOnCommand(new Light());
        invoker.setCommandAt(command, -1);
        AssertInvokerHasOnlyNoCommands(invoker);
        invoker.setCommandAt(command, Invoker.NUM_COMMANDS + 1);

        invoker.setCommandAt(command, 0);
        Assert.assertEquals(LightOnCommand.class, invoker.getCommands().get(0).getClass());
        for (int i = 1; i < Invoker.NUM_COMMANDS; i++) {
            Assert.assertEquals(NoCommand.class, invoker.getCommands().get(i).getClass());
        }
    }

    @Test
    public void TestInvokeAt() {
        Light light = new Light();
        Command command = new LightOnCommand(light);
        Invoker invoker = new Invoker();
        invoker.setCommandAt(command, 0);

        invoker.invokeAt(-1);
        Assert.assertNull(invoker.getLastCommand());

        invoker.invokeAt(Invoker.NUM_COMMANDS + 1);
        Assert.assertNull(invoker.getLastCommand());

        invoker.invokeAt(0);
        Assert.assertTrue(light.isEnabled());
        Assert.assertEquals(command, invoker.getLastCommand());
    }

    @Test
    public void TestUndo() {
        Light light = new Light();
        Command command = new LightOnCommand(light);
        Invoker invoker = new Invoker();
        invoker.setCommandAt(command, 0);
        invoker.invokeAt(0);
        Assert.assertTrue(light.isEnabled());

        Assert.assertEquals(command, invoker.getLastCommand());
        invoker.undo();
        Assert.assertFalse(light.isEnabled());
    }


    @Test
    public void TestComplexInvoker() {
        Invoker invoker = new Invoker();
        Light light = new Light();
        invoker.setCommandAt(new LightOnCommand(light), 0);
        Fan fan = new Fan();
        invoker.setCommandAt(new FanOnCommand(fan), 1);

        invoker.invokeAt(0);
        Assert.assertTrue(light.isEnabled());
        invoker.invokeAt(1);
        Assert.assertTrue(fan.isEnabled());
        Assert.assertEquals(Fan.RUNNING_SPEED, fan.getSpeed());

        invoker.undo();
        Assert.assertTrue(light.isEnabled());
        Assert.assertFalse(fan.isEnabled());
        Assert.assertEquals(Fan.STOPPED_SPEED, fan.getSpeed());
    }

    private void AssertInvokerHasOnlyNoCommands(Invoker invoker) {
        for (Command command : invoker.getCommands()) {
            Assert.assertEquals(command.getClass(), NoCommand.class);
        }
    }
}
