package io.patterns.command.command;

import org.junit.Test;

public class NoCommandTest {
    @Test
    public void TestNoCommand() {
        Command command = new NoCommand();
        command.undo();
        command.execute();
    }
}
