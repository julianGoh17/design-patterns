package io.patterns.prototype;

import io.patterns.mediator.type.LandType;
import io.patterns.prototype.monster.AirMonster;
import io.patterns.prototype.monster.LandMonster;
import io.patterns.prototype.monster.Monster;
import io.patterns.prototype.monster.SeaMonster;

public class MonsterRegistry {
    private final LandMonster landMonster;
    private final SeaMonster seaMonster;
    private final AirMonster airMonster;

    public MonsterRegistry() {
        this.landMonster = new LandMonster();
        this.seaMonster = new SeaMonster();
        this.airMonster = new AirMonster();
    }

    public LandMonster getLandMonster() {
        return landMonster;
    }

    public SeaMonster getSeaMonster() {
        return seaMonster;
    }

    public AirMonster getAirMonster() {
        return airMonster;
    }

    public Monster getMonster(LandType type) {
        switch (type) {
            case AIR:
                return airMonster.clone();
            case SEA:
                return seaMonster.clone();
            case LAND:
                return landMonster.clone();
            default:
                return null;
        }
    }
}
