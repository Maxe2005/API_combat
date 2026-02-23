package com.imt.api_combat.service;

import com.imt.api_combat.persistence.dao.CombatMongoDAO;
import com.imt.api_combat.persistence.dto.CombatMongoDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CombatService {
    private final CombatMongoDAO combatMongoDAO;

    public CombatMongoDTO getCombat(String id) {
        return combatMongoDAO.findbyId(UUID.fromString(id));
    }

    public UUID registerCombat(List<UUID> monsters, List<String> players) {
        UUID id = UUID.randomUUID();
        try {
            CombatMongoDTO combatMongoDTO = new CombatMongoDTO(id, monsters, players);
            combatMongoDAO.save(combatMongoDTO);
        } catch (Exception e) {
            return null;
        }
        return id;
    }
}
