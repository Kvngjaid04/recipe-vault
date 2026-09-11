package com.kvngjaid04.recipevault.domain.usecase

import com.kvngjaid04.recipevault.domain.repository.RecipeRepository

class GetRecipeDetailsUseCase(
    private val repository: RecipeRepository
) {
    suspend operator fun invoke(
        recipeId: Long
    ) = repository.getRecipeDetails(recipeId)
}