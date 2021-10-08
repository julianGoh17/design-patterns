package io.patterns.prototype.monster;

import io.patterns.mediator.type.Weapon;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class SeaMonsterTest {
    @Test
    public void TestCanBeHitBy() {
        Monster monster = new SeaMonster();
        Assert.assertFalse(monster.canGetHitBy(Weapon.SWORD));
        Assert.assertFalse(monster.canGetHitBy(Weapon.BOW));
        Assert.assertTrue(monster.canGetHitBy(Weapon.SPEAR));
    }

    @Test
    public void TestGetters() {
        Monster monster = new SeaMonster();
        Assert.assertEquals(5, monster.getHealth());
        Assert.assertTrue(monster.isAlive());
    }

    @Test
    public void TestGetDamagedBy() {
        Monster monster = new SeaMonster();
        int expectedHealth = 5;
        monster.getDamagedBy(Weapon.SWORD);
        Assert.assertEquals(expectedHealth, monster.getHealth());

        monster.getDamagedBy(Weapon.BOW);
        Assert.assertEquals(expectedHealth, monster.getHealth());

        monster.getDamagedBy(Weapon.SPEAR);
        expectedHealth -= Weapon.SPEAR.getDamage();
        Assert.assertEquals(expectedHealth, monster.getHealth());
    }

    @Test
    public void TestClone() {
        Monster monster = new SeaMonster();
        Monster other = monster.clone();
        Assert.assertNotEquals(monster, other);
        Assert.assertEquals(monster.getHealth(), other.getHealth());
    }
}
