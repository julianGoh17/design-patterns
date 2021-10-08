package io.patterns.mediator.type;

public enum LandType {
    LAND("land"),
    SEA("sea"),
    AIR("air");

    private final String val;

    LandType(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return this.val;
    }
}
