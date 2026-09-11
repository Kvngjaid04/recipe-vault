package com.kvngjaid04.recipevault.data.mapper

import com.kvngjaid04.recipevault.data.local.entity.RecipeVariationEntity
import com.kvngjaid04.recipevault.domain.model.RecipeVariation

fun RecipeVariationEntity.toDomain(): RecipeVariation {
    return RecipeVariation(
        id = id,
        recipeId = recipeId,
        name = name,
        description = description
    )
}

fun RecipeVariation.toEntity(): RecipeVariationEntity {
    return RecipeVariationEntity(
        id = id,
        recipeId = recipeId,
        name = name,
        description = description,
        createdAt = System.currentTimeMillis()
    )
}