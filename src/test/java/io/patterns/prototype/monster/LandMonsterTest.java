package io.patterns.prototype.monster;

import io.patterns.mediator.type.Weapon;
import org.junit.Assert;
import org.junit.Test;

public class LandMonsterTest {
    @Test
    public void TestCanBeHitBy() {
        Monster monster = new LandMonster();
        Assert.assertTrue(monster.canGetHitBy(Weapon.SWORD));
        Assert.assertTrue(monster.canGetHitBy(Weapon.BOW));
        Assert.assertTrue(monster.canGetHitBy(Weapon.SPEAR));
    }

    @Test
    public void TestGetters() {
        Monster monster = new LandMonster();
        Assert.assertEquals(10, monster.getHealth());
        Assert.assertTrue(monster.isAlive());
    }

    @Test
    public void TestGetDamagedBy() {
        Monster monster = new LandMonster();
        monster.getDamagedBy(Weapon.SWORD);
        int expectedHealth = 10 - Weapon.SWORD.getDamage();
        Assert.assertEquals(expectedHealth, monster.getHealth());

        monster.getDamagedBy(Weapon.BOW);
        expectedHealth -= Weapon.BOW.getDamage();
        Assert.assertEquals(expectedHealth, monster.getHealth());

        monster.getDamagedBy(Weapon.SPEAR);
        expectedHealth -= Weapon.SPEAR.getDamage();
        Assert.assertEquals(expectedHealth, monster.getHealth());

        monster.getDamagedBy(Weapon.SWORD);
        monster.getDamagedBy(Weapon.SWORD);
        Assert.assertFalse(monster.isAlive());
    }

    @Test
    public void TestClone() {
        Monster monster = new LandMonster();
        Monster other = monster.clone();
        Assert.assertNotEquals(monster, other);
        Assert.assertEquals(monster.getHealth(), other.getHealth());
    }
}
