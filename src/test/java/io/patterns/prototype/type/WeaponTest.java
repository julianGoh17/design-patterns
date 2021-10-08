package io.patterns.prototype.type;

import io.patterns.mediator.type.Weapon;
import org.junit.Assert;
import org.junit.Test;

public class WeaponTest {
    @Test
    public void TestToString() {
        Assert.assertEquals("sword", Weapon.SWORD.toString());
        Assert.assertEquals("bow", Weapon.BOW.toString());
        Assert.assertEquals("spear", Weapon.SPEAR.toString());
    }

    @Test
    public void TestGetDamage() {
        Assert.assertEquals(3, Weapon.SWORD.getDamage());
        Assert.assertEquals(2, Weapon.BOW.getDamage());
        Assert.assertEquals(1, Weapon.SPEAR.getDamage());
    }
}
