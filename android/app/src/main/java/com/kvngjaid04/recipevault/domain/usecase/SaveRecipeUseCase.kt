package com.kvngjaid04.recipevault.domain.usecase

import com.kvngjaid04.recipevault.domain.model.RecipeDetails
import com.kvngjaid04.recipevault.domain.repository.RecipeRepository

class SaveRecipeUseCase(
    private val repository: RecipeRepository
) {
    suspend operator fun invoke(
        recipeDetails: RecipeDetails
    ) {
        repository.saveRecipe(recipeDetails)
    }
}