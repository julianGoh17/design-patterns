package io.patterns.prototype.monster;

import io.patterns.mediator.type.Weapon;

public class SeaMonster implements Monster {
    private int health = 5;

    @Override
    public boolean canGetHitBy(Weapon weapon) {
        return Weapon.SPEAR.equals(weapon);
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
        return new SeaMonster();
    }
}

