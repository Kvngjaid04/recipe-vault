package com.kvngjaid04.recipevault.domain.repository

import com.kvngjaid04.recipevault.domain.model.Recipe
import com.kvngjaid04.recipevault.domain.model.RecipeDetails

interface RecipeRepository {

    suspend fun getRecipes(): List<Recipe>

    suspend fun getRecipeDetails(
        recipeId: Long
    ): RecipeDetails?

    suspend fun saveRecipe(
        recipeDetails: RecipeDetails
    )

    suspend fun searchRecipes(
        query: String
    ): List<Recipe>
}