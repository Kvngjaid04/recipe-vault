package com.kvngjaid04.recipevault.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.kvngjaid04.recipevault.data.local.entity.RecipeVariationEntity

@Dao
interface RecipeVariationDao {

    @Insert
    suspend fun insertVariation(
        variation: RecipeVariationEntity
    ): Long

    @Query(
        "SELECT * FROM recipe_variations WHERE recipeId = :recipeId"
    )
    suspend fun getVariationsForRecipe(
        recipeId: Long
    ): List<RecipeVariationEntity>
}