package io.patterns.command.command;

import io.patterns.command.receivers.Light;

public class LightOnCommand implements Command {
    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.enable();
    }

    @Override
    public void undo() {
        light.disable();
    }
}
