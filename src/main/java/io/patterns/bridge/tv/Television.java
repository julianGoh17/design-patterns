package io.patterns.bridge.tv;

public interface Television {
    int DEFAULT_CHANNEL = 0;
    boolean DEFAULT_IS_ENABLED = false;

    int getChannel();

    void changeChannelTo(int channel);

    boolean isEnabled();

    void setEnabled(boolean enabled);
}
