package com.imt.api_combat.persistence.dao;

import com.imt.api_combat.persistence.dto.CombatMongoDTO;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface CombatMongoDAO extends MongoRepository<CombatMongoDTO, UUID> {
    CombatMongoDTO findbyId(UUID id);
}
