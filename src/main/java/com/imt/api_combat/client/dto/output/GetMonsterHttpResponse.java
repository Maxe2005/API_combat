package com.imt.api_combat.client.dto.output;

import com.imt.api_combat.enums.Elementary;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
public class GetMonsterHttpResponse {
    private final String monsterId;
    private final String playerId;
    private final Elementary element;
    private final Double hp;
    private final Double atk;
    private final Double def;
    private final Double vit;
    private final List<SkillOutputDto> skillsList;
}
