package io.patterns.command.command;

public interface Command {
    void execute();
    void undo();
}
