package io.patterns.prototype.monster;

import io.patterns.mediator.type.Weapon;
import org.junit.Assert;
import org.junit.Test;

public class AirMonsterTest {
    @Test
    public void TestCanBeHitBy() {
        Monster monster = new AirMonster();
        Assert.assertFalse(monster.canGetHitBy(Weapon.SWORD));
        Assert.assertTrue(monster.canGetHitBy(Weapon.BOW));
        Assert.assertFalse(monster.canGetHitBy(Weapon.SPEAR));
    }

    @Test
    public void TestGetters() {
        Monster monster = new AirMonster();
        Assert.assertEquals(6, monster.getHealth());
        Assert.assertTrue(monster.isAlive());
    }

    @Test
    public void TestGetDamagedBy() {
        Monster monster = new AirMonster();
        int expectedHealth = 6;
        monster.getDamagedBy(Weapon.SWORD);
        Assert.assertEquals(expectedHealth, monster.getHealth());

        monster.getDamagedBy(Weapon.SPEAR);
        Assert.assertEquals(expectedHealth, monster.getHealth());

        monster.getDamagedBy(Weapon.BOW);
        expectedHealth -= Weapon.BOW.getDamage();
        Assert.assertEquals(expectedHealth, monster.getHealth());
    }

    @Test
    public void TestClone() {
        Monster monster = new AirMonster();
        Monster other = monster.clone();
        Assert.assertNotEquals(monster, other);
        Assert.assertEquals(monster.getHealth(), other.getHealth());
    }
}
