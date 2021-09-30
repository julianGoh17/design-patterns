package io.patterns.command.components;

import io.patterns.command.command.Command;
import io.patterns.command.command.NoCommand;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    public final static int NUM_COMMANDS = 7;
    private final List<Command> commands;
    private Command lastCommand;

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

    public void invokeAt(int index) {
        if (index >= 0 && index < NUM_COMMANDS) {
            lastCommand = commands.get(index);
            lastCommand.execute();
        }
    }

    public void undo() {
        lastCommand.undo();
    }

    public List<Command> getCommands() {
        return commands;
    }

    public Command getLastCommand() {
        return lastCommand;
    }
}
