package io.patterns.state.states;

import io.patterns.state.GumBallMachine;

public class NoQuarterState extends State {
    public NoQuarterState(GumBallMachine machine) {
        super(machine);
    }

    @Override
    public String insertQuarter() {
        machine.setState(machine.getPaidState());
        return "Success";
    }
}
