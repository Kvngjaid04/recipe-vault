package com.kvngjaid04.recipevault.presentation.add_recipe

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kvngjaid04.recipevault.domain.model.Recipe
import com.kvngjaid04.recipevault.domain.model.RecipeDetails
import com.kvngjaid04.recipevault.domain.usecase.SaveRecipeUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AddRecipeViewModel @Inject constructor(
    private val saveRecipeUseCase: SaveRecipeUseCase
) : ViewModel() {

    fun saveRecipe(
        title: String,
        servings: Int,
        instructions: String
    ) {
        viewModelScope.launch {
            val recipe = Recipe(
                title = title,
                servings = servings,
                instructions = instructions
            )

            val details = RecipeDetails(
                recipe = recipe,
                ingredients = emptyList(),
                steps = emptyList(),
                variations = emptyList()
            )

            saveRecipeUseCase(details)
        }
    }
}
