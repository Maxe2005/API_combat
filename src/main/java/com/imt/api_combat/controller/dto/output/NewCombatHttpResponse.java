package com.imt.api_combat.controller.dto.output;

import lombok.Data;

import java.util.UUID;

@Data
public class NewCombatHttpResponse {
    private UUID combatId;

    public NewCombatHttpResponse(UUID combatId) {
        this.combatId = combatId;
    }
}
