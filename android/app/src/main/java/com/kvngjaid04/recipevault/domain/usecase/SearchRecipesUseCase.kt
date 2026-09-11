package com.kvngjaid04.recipevault.domain.usecase

import com.kvngjaid04.recipevault.domain.model.Recipe
import com.kvngjaid04.recipevault.domain.repository.RecipeRepository

class SearchRecipesUseCase(
    private val repository: RecipeRepository
) {

    suspend operator fun invoke(
        query: String
    ): List<Recipe> {
        return repository.searchRecipes(query)
    }
}