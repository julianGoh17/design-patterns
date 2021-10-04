package io.patterns.state;

import io.patterns.state.states.NoQuarterState;
import io.patterns.state.states.PaidState;
import io.patterns.state.states.SoldOutState;
import io.patterns.state.states.SoldState;
import io.patterns.state.states.State;

public class GumBallMachine {
    private int count;
    private final NoQuarterState noQuarterState;
    private final PaidState paidState;
    private final SoldState soldState;
    private final SoldOutState soldOutState;

    private State state;

    public GumBallMachine(int count) {
        this.count = count;
        this.noQuarterState = new NoQuarterState(this);
        this.paidState = new PaidState(this);
        this.soldState = new SoldState(this);
        this.soldOutState = new SoldOutState(this);
        this.state = count > 0 ? this.noQuarterState : this.soldOutState;
    }

    public void setState(State state) {
        this.state = state;
    }

    public NoQuarterState getNoQuarterState() {
        return noQuarterState;
    }

    public PaidState getPaidState() {
        return paidState;
    }

    public SoldState getSoldState() {
        return soldState;
    }

    public SoldOutState getSoldOutState() {
        return soldOutState;
    }

    public State getState() {
        return state;
    }

    public int getCount() {
        return count;
    }

    public void decrementCount() {
        this.count -= 1;
    }
}
