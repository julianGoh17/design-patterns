package io.patterns.command.components;

import io.patterns.command.command.Command;
import io.patterns.command.command.LightOnCommand;
import io.patterns.command.command.NoCommand;
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

    private void AssertInvokerHasOnlyNoCommands(Invoker invoker) {
        for (Command command : invoker.getCommands()) {
            Assert.assertEquals(command.getClass(), NoCommand.class);
        }
    }
}
