package io.patterns.prototype.monster;

import io.patterns.mediator.type.Weapon;

public class AirMonster implements Monster {
    private int health = 6;

    @Override
    public boolean canGetHitBy(Weapon weapon) {
        return Weapon.BOW.equals(weapon);
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void getDamagedBy(Weapon weapon) {
        if (canGetHitBy(weapon)) {
            this.health -= weapon.getDamage();
        }
    }

    @Override
    public Monster clone() {
        return new AirMonster();
    }
}
