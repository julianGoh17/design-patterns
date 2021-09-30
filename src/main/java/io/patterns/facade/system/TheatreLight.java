package io.patterns.facade.system;

public class TheatreLight {
    private boolean enabled;
    private double luminosity;

    public boolean isEnabled() {
        return enabled;
    }


    public double getLuminosity() {
        return luminosity;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public void setLuminosity(double luminosity) {
        this.luminosity = luminosity;
    }
}
