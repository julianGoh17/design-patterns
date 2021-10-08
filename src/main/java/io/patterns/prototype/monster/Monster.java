package io.patterns.prototype.monster;

import io.patterns.mediator.type.Weapon;

public interface Monster {
    boolean canGetHitBy(Weapon weapon);

    int getHealth();

    default boolean isAlive() {
        return getHealth() > 0;
    }

    void getDamagedBy(Weapon weapon);

    Monster clone();
}
