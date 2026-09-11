package com.kvngjaid04.recipevault.data.mapper

import com.kvngjaid04.recipevault.data.local.entity.IngredientEntity
import com.kvngjaid04.recipevault.domain.model.Ingredient

fun IngredientEntity.toDomain(): Ingredient {
    return Ingredient(
        id = id,
        recipeId = recipeId,
        catalogId = catalogId,
        quantity = quantity,
        unit = unit,
        unitType = unitType
    )
}

fun Ingredient.toEntity(): IngredientEntity {
    return IngredientEntity(
        id = id,
        recipeId = recipeId,
        catalogId = catalogId,
        quantity = quantity,
        unit = unit,
        unitType = unitType
    )
}