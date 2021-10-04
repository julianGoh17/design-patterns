package io.patterns.state.states;

import io.patterns.state.GumBallMachine;

public class SoldState extends State {
    public SoldState(GumBallMachine machine) {
        super(machine);
    }

    @Override
    public Integer dispense() {
        machine.decrementCount();
        if (machine.getCount() > 0) {
            machine.setState(machine.getNoQuarterState());
        } else {
            machine.setState(machine.getSoldOutState());
        }
        return 1;
    }
}
