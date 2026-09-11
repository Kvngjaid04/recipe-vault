package com.kvngjaid04.recipevault.data.local.relation

import androidx.room.Embedded
import androidx.room.Relation
import com.kvngjaid04.recipevault.data.local.entity.RecipeEntity
import com.kvngjaid04.recipevault.data.local.entity.RecipeStepEntity

data class RecipeWithSteps(
    @Embedded
    val recipe: RecipeEntity,

    @Relation(
        parentColumn = "id",
        entityColumn = "recipeId"
    )
    val steps: List<RecipeStepEntity>
)