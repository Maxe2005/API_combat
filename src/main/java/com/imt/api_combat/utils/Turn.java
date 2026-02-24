package com.imt.api_combat.utils;

import java.util.Hashtable;
import java.util.List;
import java.util.UUID;

public class Turn {
    private final int id;
    private final List<UUID> monsters;
    private final Hashtable<UUID, MonsterInfo> monstersInfo = new Hashtable<>();

    public Turn(int id, List<UUID> monsters) {
        this.id = id;
        this.monsters = monsters;
    }

    private void buildInfo() {
        for (UUID monster : monsters) {

        }
    }
}
