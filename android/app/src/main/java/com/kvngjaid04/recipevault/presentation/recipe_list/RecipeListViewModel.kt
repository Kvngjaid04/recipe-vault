package com.kvngjaid04.recipevault.presentation.recipe_list

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kvngjaid04.recipevault.domain.model.Recipe
import com.kvngjaid04.recipevault.domain.repository.RecipeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RecipeListViewModel @Inject constructor(
    private val repository: RecipeRepository
) : ViewModel() {

    private val _recipes =
        MutableStateFlow<List<Recipe>>(emptyList())

    val recipes: StateFlow<List<Recipe>>
            = _recipes

    init {
        loadRecipes()
    }

    private fun loadRecipes() {
        viewModelScope.launch {
            _recipes.value =
                repository.getRecipes()
        }
    }
}