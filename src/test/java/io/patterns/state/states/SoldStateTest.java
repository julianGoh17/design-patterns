package io.patterns.state.states;

import io.patterns.state.GumBallMachine;
import io.patterns.state.GumBallMachineTest;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class SoldStateTest {
    @Test
    public void TestInvalidMethods() {
        GumBallMachine machine = new GumBallMachine(GumBallMachineTest.COUNT);
        State state = new SoldState(machine);

        Assert.assertNull(state.insertQuarter());
        Assert.assertNull(state.ejectQuarter());
        Assert.assertNull(state.turnCrank());
        Assert.assertEquals(machine.getNoQuarterState(), machine.getState());
    }

    @Test
    public void TestDispenseMethodTransitionsToNoQuarter() {
        GumBallMachine machine = new GumBallMachine(GumBallMachineTest.COUNT);
        State state = new SoldState(machine);

        Assert.assertEquals(1, state.dispense().intValue());
        Assert.assertEquals(GumBallMachineTest.COUNT - 1, machine.getCount());
        Assert.assertEquals(machine.getNoQuarterState(), machine.getState());
    }

    @Test
    public void TestDispenseMethodTransitionsToSoldOut() {
        GumBallMachine machine = new GumBallMachine(1);
        State state = new SoldState(machine);

        Assert.assertEquals(1, state.dispense().intValue());
        Assert.assertEquals(0, machine.getCount());
        Assert.assertEquals(machine.getSoldOutState(), machine.getState());
    }
}
