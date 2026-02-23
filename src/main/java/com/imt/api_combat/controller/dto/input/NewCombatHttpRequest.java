package com.imt.api_combat.controller.dto.input;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class NewCombatHttpRequest {
    private List<UUID> monsters;
    private List<String> players;
}
