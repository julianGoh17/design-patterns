package io.patterns.prototype.monster;

import io.patterns.mediator.type.Weapon;

public class LandMonster implements Monster {
    private int health = 10;

    @Override
    public void getDamagedBy(Weapon weapon) {
        this.health -= weapon.getDamage();
    }

    @Override
    public boolean canGetHitBy(Weapon weapon) {
        return weapon != null;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public Monster clone() {
        return new LandMonster();
    }
}
