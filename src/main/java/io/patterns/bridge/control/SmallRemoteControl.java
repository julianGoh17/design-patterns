package io.patterns.bridge.control;

import io.patterns.bridge.tv.Television;

public class SmallRemoteControl extends RemoteControl {
    public SmallRemoteControl(Television television) {
        super(television);
    }

    @Override
    public void on() {
        this.television.setEnabled(true);
    }

    @Override
    public void off() {
        this.television.setEnabled(false);
    }

    public void incrementChannel() {
        setChannel(television.getChannel() + 1);
    }
}
