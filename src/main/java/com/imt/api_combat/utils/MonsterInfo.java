package com.imt.api_combat.utils;

import lombok.Getter;

@Getter
public class MonsterInfo {
    private final double hp;
    private final double atk;
    private final double def;
    private final double vit;

    public MonsterInfo(double hp, double atk, double def, double vit) {
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.vit = vit;
    }
}
