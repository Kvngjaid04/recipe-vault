package com.kvngjaid04.recipevault.data.repository

import com.kvngjaid04.recipevault.data.local.dao.RecipeDao
import com.kvngjaid04.recipevault.data.local.entity.RecipeEntity

class RecipeRepository(
    private val recipeDao: RecipeDao
) {

    suspend fun addRecipe(recipe: RecipeEntity) {
        recipeDao.insertRecipe(recipe)
    }

    suspend fun getRecipes(): List<RecipeEntity> {
        return recipeDao.getAllRecipes()
    }
}