package com.kvngjaid04.recipevault.data.mapper

import com.kvngjaid04.recipevault.data.local.entity.RecipeEntity
import com.kvngjaid04.recipevault.domain.model.Recipe

fun RecipeEntity.toDomain(): Recipe {
    return Recipe(
        id = id,
        title = title,
        instructions = instructions,
        servings = servings,
        favorite = favorite
    )
}

fun Recipe.toEntity(): RecipeEntity {
    return RecipeEntity(
        id = id,
        title = title,
        instructions = instructions,
        servings = servings,
        favorite = favorite,
        createdAt = createdAt,
        updatedAt = updatedAt
    )
}