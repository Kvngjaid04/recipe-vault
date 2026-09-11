package com.kvngjaid04.recipevault.data.local.relation

import androidx.room.Embedded
import androidx.room.Relation
import com.kvngjaid04.recipevault.data.local.entity.IngredientEntity
import com.kvngjaid04.recipevault.data.local.entity.RecipeEntity

data class RecipeWithIngredients(
    @Embedded
    val recipe: RecipeEntity,

    @Relation(
        parentColumn = "id",
        entityColumn = "recipeId"
    )
    val ingredients: List<IngredientEntity>
)