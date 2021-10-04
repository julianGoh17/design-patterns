package io.patterns.state.states;

import io.patterns.state.GumBallMachine;
import io.patterns.state.GumBallMachineTest;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class NoQuarterStateTest {
    @Test
    public void TestInitialization() {
        GumBallMachine machine = new GumBallMachine(GumBallMachineTest.COUNT);
        State state = new NoQuarterState(machine);
        Assert.assertNotNull(state.getMachine());
    }

    @Test
    public void TestMethodsReturnInvalidState() {
        GumBallMachine machine = new GumBallMachine(GumBallMachineTest.COUNT);
        State state = new NoQuarterState(machine);
        Assert.assertNull(state.ejectQuarter());
        Assert.assertNull(state.turnCrank());
        Assert.assertNull(state.dispense());
        Assert.assertEquals(machine.getNoQuarterState(), machine.getState());
    }

    @Test
    public void TestInsertQuarter() {
        GumBallMachine machine = new GumBallMachine(GumBallMachineTest.COUNT);
        Assert.assertEquals("Success", machine.getNoQuarterState().insertQuarter());
        Assert.assertEquals(machine.getPaidState(), machine.getState());
    }
}
