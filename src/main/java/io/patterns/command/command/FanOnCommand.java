package io.patterns.command.command;

import io.patterns.command.receivers.Fan;

public class FanOnCommand implements Command {
    private final Fan fan;

    public FanOnCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.enable();
    }

    @Override
    public void undo() {
        fan.disable();
    }
}
