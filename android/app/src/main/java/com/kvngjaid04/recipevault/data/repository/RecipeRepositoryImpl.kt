package com.kvngjaid04.recipevault.data.repository

import com.kvngjaid04.recipevault.data.local.dao.RecipeDao
import com.kvngjaid04.recipevault.domain.model.Recipe
import com.kvngjaid04.recipevault.domain.model.RecipeDetails
import com.kvngjaid04.recipevault.domain.repository.RecipeRepository
import com.kvngjaid04.recipevault.data.local.dao.IngredientDao
import com.kvngjaid04.recipevault.data.local.dao.RecipeStepDao
import com.kvngjaid04.recipevault.data.local.dao.RecipeVariationDao
import com.kvngjaid04.recipevault.data.mapper.toDomain
import com.kvngjaid04.recipevault.data.mapper.toEntity


class RecipeRepositoryImpl(
    private val recipeDao: RecipeDao,
    private val ingredientDao: IngredientDao,
    private val recipeStepDao: RecipeStepDao,
    private val recipeVariationDao: RecipeVariationDao
) : RecipeRepository {

    override suspend fun getRecipes(): List<Recipe> {
        return recipeDao
            .getAllRecipes()
            .map { it.toDomain() }
    }
    override suspend fun searchRecipes(
             query: String
        ): List<Recipe> {

        return recipeDao
            .searchRecipes(query)
            .map { it.toDomain() }
    }

    override suspend fun getRecipeDetails(
        recipeId: Long
    ): RecipeDetails? {

        val recipe =
            recipeDao.getRecipeById(recipeId)?.toDomain()
                ?: return null

        val ingredients =
            ingredientDao
                .getIngredientsForRecipe(recipeId)
                .map { it.toDomain() }

        val steps =
            recipeStepDao
                .getStepsForRecipe(recipeId)
                .map { it.toDomain() }

        val variations =
            recipeVariationDao
                .getVariationsForRecipe(recipeId)
                .map { it.toDomain() }

        return RecipeDetails(
            recipe = recipe,
            ingredients = ingredients,
            steps = steps,
            variations = variations
        )
    }

    override suspend fun saveRecipe(
        recipeDetails: RecipeDetails
    ) {

        val recipeId =
            recipeDao.insertRecipe(
                recipeDetails.recipe.toEntity()
            )

        recipeDetails.ingredients.forEach {
            ingredientDao.insertIngredient(
                it.copy(recipeId = recipeId)
                    .toEntity()
            )
        }

        recipeDetails.steps.forEach {
            recipeStepDao.insertStep(
                it.copy(recipeId = recipeId)
                    .toEntity()
            )
        }

        recipeDetails.variations.forEach {
            recipeVariationDao.insertVariation(
                it.copy(recipeId = recipeId)
                    .toEntity()
            )
        }
    }
}