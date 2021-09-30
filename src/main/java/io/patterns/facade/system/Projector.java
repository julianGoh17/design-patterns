package io.patterns.facade.system;

public class Projector {
    private String dvd;
    private boolean enabled;

    public String getDvd() {
        return dvd;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setDvd(String dvd) {
        this.dvd = dvd;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
