package com.imt.api_combat.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Elementary {
    FIRE("fire"),
    WATER("water"),
    WIND("wind");
    private final String name;
}

