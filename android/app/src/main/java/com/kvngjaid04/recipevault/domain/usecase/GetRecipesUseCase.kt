package com.kvngjaid04.recipevault.domain.usecase

import com.kvngjaid04.recipevault.domain.repository.RecipeRepository

class GetRecipesUseCase(
    private val repository: RecipeRepository
) {
    suspend operator fun invoke() =
        repository.getRecipes()
}