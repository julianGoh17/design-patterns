package io.patterns.bridge.tv;

public class SonyTelevision implements Television {
    private int channel = DEFAULT_CHANNEL;
    private boolean isEnabled = DEFAULT_IS_ENABLED;

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void changeChannelTo(int channel) {
        this.channel = channel;
    }

    @Override
    public boolean isEnabled() {
        return isEnabled;
    }

    @Override
    public void setEnabled(boolean enabled) {
        this.isEnabled = enabled;
    }
}
