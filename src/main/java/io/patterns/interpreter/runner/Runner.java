package io.patterns.interpreter.runner;

public class Runner {
    private int x;
    private int y;
    private Direction direction;

    public Runner() {
        this.x = 0;
        this.y = 0;
        this.direction = Direction.NORTH;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Direction getDirection() {
        return direction;
    }

    @Override
    public String toString() {
        return String.format("(%d, %d) %s", x, y, direction.toString());
    }

    public void forward() {
        switch (direction) {
            case EAST:
                this.x += 1;
                return;
            case WEST:
                this.x -= 1;
                return;
            case NORTH:
                this.y += 1;
                return;
            default:
                this.y -= 1;
        }
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void turnRight() {
        switch (direction) {
            case NORTH:
                this.direction = Direction.EAST;
                return;
            case EAST:
                this.direction = Direction.SOUTH;
                return;
            case SOUTH:
                this.direction = Direction.WEST;
                return;
            default:
                this.direction = Direction.NORTH;
        }
    }
}
