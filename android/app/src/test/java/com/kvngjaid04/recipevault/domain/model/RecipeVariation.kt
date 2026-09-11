package com.kvngjaid04.recipevault.domain.model

data class RecipeVariation(
    val id: Long = 0,
    val recipeId: Long,
    val name: String,
    val description: String
)
