package com.imt.api_combat.controller;

import com.imt.api_combat.controller.dto.input.NewCombatTurnHttpRequest;
import com.imt.api_combat.controller.dto.input.NewCombatHttpRequest;
import com.imt.api_combat.controller.dto.output.NewCombatHttpResponse;
import com.imt.api_combat.service.CombatService;
import jakarta.validation.ValidationException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/combat")
public class CombatController {
    private final CombatService combatService;

    public ResponseEntity<NewCombatHttpResponse> registerCombat(@RequestBody NewCombatHttpRequest request) {
        if (request.getMonsters().isEmpty() && request.getPlayers().isEmpty()) throw new ValidationException("Monsters and Players list cannot be empty");
        if (request.getMonsters().isEmpty()) throw new ValidationException("Monsters list cannot be empty");
        if (request.getPlayers().isEmpty()) throw new ValidationException("Players list cannot be empty");

        UUID save = combatService.registerCombat(
            request.getMonsters(),
            request.getPlayers()
        );
        if (save == null) return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        return ResponseEntity.ok(new NewCombatHttpResponse(save));
    }

    public HttpStatus addCombatTurn(@RequestBody NewCombatTurnHttpRequest request) {
        // To implement
    }
}
