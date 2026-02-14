package com.imt.api_combat.service;

import com.imt.api_combat.persistence.dao.CombatMongoDAO;
import com.imt.api_combat.persistence.dto.CombatMongoDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CombatService {
    private final CombatMongoDAO combatMongoDAO;

    public CombatMongoDTO getCombat(String id) {
        return combatMongoDAO.findbyId(UUID.fromString(id));
    }
}
