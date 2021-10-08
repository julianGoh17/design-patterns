package io.patterns.mediator.type;

public enum Weapon {
    SWORD("sword", 3),
    BOW("bow", 2),
    SPEAR("spear", 1);

    private final String val;
    private final int damage;

    Weapon(String val, int damage) {
        this.val = val;
        this.damage = damage;
    }

    @Override
    public String toString() {
        return val;
    }

    public int getDamage() {
        return damage;
    }
}
