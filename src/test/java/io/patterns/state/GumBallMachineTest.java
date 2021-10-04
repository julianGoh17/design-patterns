package io.patterns.state;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class GumBallMachineTest {
    public static final int COUNT = 10;

    @Test
    public void TestGumBallMachineInitialization() {
        GumBallMachine machine = new GumBallMachine(COUNT);
        Assert.assertNotNull(machine.getNoQuarterState());
        Assert.assertNotNull(machine.getPaidState());
        Assert.assertNotNull(machine.getSoldState());
        Assert.assertNotNull(machine.getSoldOutState());
        Assert.assertEquals(machine.getNoQuarterState(), machine.getState());

        machine = new GumBallMachine(0);
        Assert.assertEquals(machine.getSoldOutState(), machine.getState());
    }

    @Test
    public void TestGumBallSetState() {
        GumBallMachine machine = new GumBallMachine(COUNT);
        machine.setState(machine.getPaidState());
        Assert.assertEquals(machine.getPaidState(), machine.getPaidState());
    }

    @Test
    public void TestDecrementCount() {
        GumBallMachine machine = new GumBallMachine(COUNT);
        machine.decrementCount();
        Assert.assertEquals(COUNT - 1, machine.getCount());
    }
}
