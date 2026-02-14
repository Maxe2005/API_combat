package com.imt.api_combat.controller;

import com.imt.api_combat.service.CombatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/combat")
public class CombatController {
    private final CombatService combatService;
}
