package com.kvngjaid04.recipevault.data.mapper

import com.kvngjaid04.recipevault.data.local.entity.RecipeStepEntity
import com.kvngjaid04.recipevault.domain.model.RecipeStep

fun RecipeStepEntity.toDomain(): RecipeStep {
    return RecipeStep(
        id = id,
        recipeId = recipeId,
        stepNumber = stepNumber,
        title = title,
        instruction = instruction,
        timerMinutes = timerMinutes
    )
}