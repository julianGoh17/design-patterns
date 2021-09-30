package io.patterns.command.components;

import io.patterns.command.command.Command;
import io.patterns.command.command.NoCommand;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    public final static int NUM_COMMANDS = 7;
    private List<Command> commands;

    public Invoker() {
        commands = new ArrayList<>();
        for (int iteration=0; iteration < NUM_COMMANDS; iteration++) {
            commands.add(new NoCommand());
        }
    }

    public void setCommandAt(Command command, int index) {
        if (index >=0 && index < NUM_COMMANDS) {
            commands.set(index, command);
        }
    }

    public List<Command> getCommands() {
        return commands;
    }
}
