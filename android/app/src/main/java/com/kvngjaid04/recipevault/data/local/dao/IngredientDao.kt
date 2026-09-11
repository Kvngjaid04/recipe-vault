package com.kvngjaid04.recipevault.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.kvngjaid04.recipevault.data.local.entity.IngredientEntity

@Dao
interface IngredientDao {

    @Insert
    suspend fun insertIngredient(
        ingredient: IngredientEntity
    ): Long

    @Query(
        "SELECT * FROM ingredients WHERE recipeId = :recipeId"
    )
    suspend fun getIngredientsForRecipe(
        recipeId: Long
    ): List<IngredientEntity>
}