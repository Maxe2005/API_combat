package com.imt.api_combat.persistence.dto;


import com.imt.api_combat.utils.Turn;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.List;
import java.util.UUID;

@Document(collection = "combat")
@RequiredArgsConstructor
@Data
public class CombatMongoDTO {
    @MongoId
    private final UUID id;
    private final List<UUID> monsters;
    private final List<String> players;
    private List<Turn> turns;
    private boolean isFinished;
    private String winner;
}
