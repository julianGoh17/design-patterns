package io.patterns.state.states;

import io.patterns.state.GumBallMachine;

public abstract class State {
    public static final String SUCCESS_STRING = "Success";

    protected final GumBallMachine machine;

    public State(GumBallMachine machine) {
        this.machine = machine;
    }

    public GumBallMachine getMachine() {
        return machine;
    }

    public String insertQuarter() {
        return null;
    }

    public String ejectQuarter() {
        return null;
    }

    public String turnCrank() {
        return null;
    }

    public Integer dispense() {
        return null;
    }
}
