package com.imt.api_combat.utils;

import java.util.List;
import java.util.UUID;

public class Turn {
    private final int id;
    private final List<UUID> monsters;

    public Turn(int id, List<UUID> monsters) {
        this.id = id;
        this.monsters = monsters;
    }
}
