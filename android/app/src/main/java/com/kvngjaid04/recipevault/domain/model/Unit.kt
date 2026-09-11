package com.kvngjaid04.recipevault.domain.model

enum class Unit(
    val symbol: String,
    val type: UnitType
) {
    PIECE("pcs", UnitType.COUNT),

    G("g", UnitType.WEIGHT),
    KG("kg", UnitType.WEIGHT),

    ML("ml", UnitType.VOLUME),
    L("l", UnitType.VOLUME),

    TSP("tsp", UnitType.VOLUME),
    TBSP("tbsp", UnitType.VOLUME),
    CUP("cup", UnitType.VOLUME)
}