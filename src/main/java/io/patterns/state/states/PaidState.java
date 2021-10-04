package io.patterns.state.states;

import io.patterns.state.GumBallMachine;

public class PaidState extends State {
    public PaidState(GumBallMachine machine) {
        super(machine);
    }

    @Override
    public String ejectQuarter() {
        machine.setState(machine.getNoQuarterState());
        return SUCCESS_STRING;
    }

    @Override
    public String turnCrank() {
        machine.setState(machine.getPaidState());
        return SUCCESS_STRING;
    }
}
