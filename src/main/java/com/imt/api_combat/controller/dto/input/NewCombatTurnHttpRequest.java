package com.imt.api_combat.controller.dto.input;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NewCombatTurnHttpRequest {
    private String combatId;
    private String skillUsed;
}
