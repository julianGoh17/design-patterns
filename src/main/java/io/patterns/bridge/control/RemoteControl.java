package io.patterns.bridge.control;

import io.patterns.bridge.tv.Television;

public abstract class RemoteControl {
    protected final Television television;

    public RemoteControl(Television television) {
        this.television = television;
    }

    public abstract void on();

    public abstract void off();

    public final void setChannel(int channel) {
        television.changeChannelTo(channel);
    }
}
