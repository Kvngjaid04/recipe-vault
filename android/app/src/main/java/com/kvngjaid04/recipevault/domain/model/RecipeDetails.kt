package com.kvngjaid04.recipevault.domain.model

data class RecipeDetails(
    val recipe: Recipe,
    val ingredients: List<Ingredient>,
    val steps: List<RecipeStep>,
    val variations: List<RecipeVariation>,

)