package com.kvngjaid04.recipevault.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.kvngjaid04.recipevault.data.local.entity.RecipeStepEntity

@Dao
interface RecipeStepDao {

    @Insert
    suspend fun insertStep(
        step: RecipeStepEntity
    ): Long

    @Query(
        "SELECT * FROM recipe_steps WHERE recipeId = :recipeId ORDER BY stepNumber"
    )
    suspend fun getStepsForRecipe(
        recipeId: Long
    ): List<RecipeStepEntity>
}