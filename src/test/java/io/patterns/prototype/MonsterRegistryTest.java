package io.patterns.prototype;

import io.patterns.mediator.type.LandType;
import io.patterns.prototype.monster.Monster;
import org.junit.Assert;
import org.junit.Test;

public class MonsterRegistryTest {
    @Test
    public void TestInitialization() {
        MonsterRegistry registry = new MonsterRegistry();
        Assert.assertNotNull(registry.getLandMonster());
        Assert.assertNotNull(registry.getSeaMonster());
        Assert.assertNotNull(registry.getAirMonster());
    }

    @Test
    public void TestGetMonsterForLandType() {
        MonsterRegistry registry = new MonsterRegistry();
        Monster monster = registry.getMonster(LandType.LAND);
        Assert.assertNotNull(monster);
        Assert.assertNotEquals(registry.getLandMonster(), monster);
        Assert.assertEquals(registry.getLandMonster().getHealth(), monster.getHealth());
    }

    @Test
    public void TestGetMonsterForSeaType() {
        MonsterRegistry registry = new MonsterRegistry();
        Monster monster = registry.getMonster(LandType.SEA);
        Assert.assertNotNull(monster);
        Assert.assertNotEquals(registry.getSeaMonster(), monster);
        Assert.assertEquals(registry.getSeaMonster().getHealth(), monster.getHealth());
    }

    @Test
    public void TestGetMonsterForAirType() {
        MonsterRegistry registry = new MonsterRegistry();
        Monster monster = registry.getMonster(LandType.AIR);
        Assert.assertNotNull(monster);
        Assert.assertNotEquals(registry.getAirMonster(), monster);
        Assert.assertEquals(registry.getAirMonster().getHealth(), monster.getHealth());
    }
}
