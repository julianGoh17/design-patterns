package io.patterns.facade.system;

public class SoundSystem {
    private boolean enabled;
    private int volume;

    public boolean isEnabled() {
        return this.enabled;
    }

    public int getVolume() {
        return volume;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
