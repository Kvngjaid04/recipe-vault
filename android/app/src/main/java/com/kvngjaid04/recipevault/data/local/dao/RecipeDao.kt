package com.kvngjaid04.recipevault.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.kvngjaid04.recipevault.data.local.entity.RecipeEntity

@Dao
interface RecipeDao {

    @Insert
    suspend fun insertRecipe(
        recipe: RecipeEntity
    ): Long

    @Delete
    suspend fun deleteRecipe(recipe: RecipeEntity)

    @Update
    suspend fun updateRecipe(recipe: RecipeEntity)

    @Query("SELECT * FROM recipes")
    suspend fun getAllRecipes(): List<RecipeEntity>

    @Query("SELECT * FROM recipes WHERE id = :id")
    suspend fun getRecipeById(id: Long): RecipeEntity?

    @Query("""SELECT * FROM recipes WHERE title LIKE '%' || :query || '%' """)
    suspend fun searchRecipes(query: String): List<RecipeEntity>
}

