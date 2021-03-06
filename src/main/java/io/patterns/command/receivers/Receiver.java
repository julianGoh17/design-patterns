package io.patterns.command.receivers;

public abstract class Receiver {
    protected boolean enabled;

    public Receiver() {
        this.enabled = false;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void enable() {
        this.enabled = true;
    }

    public void disable() {
        this.enabled = false;
    }}
