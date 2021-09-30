package io.patterns.command.receivers;

public class Light {
    private boolean enabled;

    public Light() {
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
    }
}
