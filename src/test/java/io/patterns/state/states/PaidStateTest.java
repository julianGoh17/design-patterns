package io.patterns.state.states;

import io.patterns.state.GumBallMachine;
import io.patterns.state.GumBallMachineTest;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class PaidStateTest {
    @Test
    public void TestInvalidMethods() {
        GumBallMachine machine = new GumBallMachine(GumBallMachineTest.COUNT);
        State state = new PaidState(machine);

        Assert.assertNull(state.insertQuarter());
        Assert.assertNull(state.dispense());
        Assert.assertEquals(machine.getNoQuarterState(), machine.getState());
    }

    @Test
    public void TestEject() {
        GumBallMachine machine = new GumBallMachine(GumBallMachineTest.COUNT);
        State state = new PaidState(machine);

        Assert.assertEquals(State.SUCCESS_STRING, state.ejectQuarter());
        Assert.assertEquals(machine.getNoQuarterState(), machine.getState());
    }

    @Test
    public void TestTurnCrank() {
        GumBallMachine machine = new GumBallMachine(GumBallMachineTest.COUNT);
        State state = new PaidState(machine);

        Assert.assertEquals(State.SUCCESS_STRING, state.turnCrank());
        Assert.assertEquals(machine.getPaidState(), machine.getState());
    }
}
