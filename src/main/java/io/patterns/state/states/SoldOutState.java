package io.patterns.state.states;

import io.patterns.state.GumBallMachine;

public class SoldOutState extends State {
    public SoldOutState(GumBallMachine machine) {
        super(machine);
    }
}
