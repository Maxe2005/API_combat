package com.imt.api_combat.client.dto.output;

import com.imt.api_combat.enums.Ratio;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class SkillOutputDto {
    private final String skillId;
    private final String monsterId;
    private final Integer num;
    private final Double dmg;
    private final Ratio ratio;
    private final Integer cooldown;
    private final Integer lvl;
    private final Integer lvlMax;
}
