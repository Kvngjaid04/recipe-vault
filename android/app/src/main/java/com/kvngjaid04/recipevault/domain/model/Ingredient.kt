package com.kvngjaid04.recipevault.domain.model

data class Ingredient(
    val id: Long = 0,
    val recipeId: Long,
    val catalogId: Long,
    val quantity: Double,
    val unit: String,
    val unitType: UnitType
)