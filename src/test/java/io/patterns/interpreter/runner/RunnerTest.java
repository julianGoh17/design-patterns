package io.patterns.interpreter.runner;

import io.patterns.flyweight.Pair;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class RunnerTest {
    @Test
    public void TestGetterAndSetter() {
        Runner runner = new Runner();
        Assert.assertEquals(0, runner.getX());
        Assert.assertEquals(0, runner.getY());
        Assert.assertEquals(Direction.NORTH, runner.getDirection());
        Assert.assertEquals("(0, 0) north", runner.toString());
        runner.setDirection(Direction.EAST);
        Assert.assertEquals(Direction.EAST, runner.getDirection());
        Assert.assertEquals("(0, 0) east", runner.toString());
    }

    @Test
    public void TestForward() {
        List<Direction> directions = Arrays.asList(Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST);
        List<Pair<Integer, Integer>> coordinates = Arrays.asList(new Pair<>(0, 1), new Pair<>(1, 0),
            new Pair<>(0, -1), new Pair<>(-1, 0));
        for (int i = 0; i < directions.size(); i++) {
            Direction direction = directions.get(i);
            Pair<Integer, Integer> expectedCoordinates = coordinates.get(i);
            Runner runner = new Runner();
            runner.setDirection(direction);
            runner.forward();
            Assert.assertEquals(expectedCoordinates.getLeft().intValue(), runner.getX());
            Assert.assertEquals(expectedCoordinates.getRight().intValue(), runner.getY());
        }
    }

    @Test
    public void TestTurnRight() {
        List<Direction> directions = Arrays.asList(Direction.EAST, Direction.SOUTH, Direction.WEST, Direction.NORTH);
        Runner runner = new Runner();
        directions.forEach(direction -> {
            runner.turnRight();
            Assert.assertEquals(direction, runner.getDirection());
        });
    }
}
