package com.imt.api_combat.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Stat {
    ATK("atk"),
    DEF("def"),
    VIT("vit");
    private final String name;
}
