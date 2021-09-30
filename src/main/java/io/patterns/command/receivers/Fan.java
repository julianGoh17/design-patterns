package io.patterns.command.receivers;

public class Fan extends Receiver {
    public final static int RUNNING_SPEED = 10;
    public final static int STOPPED_SPEED = 0;

    private int speed;

    public Fan() {
        super();
        speed = STOPPED_SPEED;
    }

    @Override
    public void enable() {
        super.enable();
        speed = RUNNING_SPEED;
    }

    @Override
    public void disable() {
        super.disable();
        speed = STOPPED_SPEED;
    }

    public int getSpeed() {
        return speed;
    }
}
