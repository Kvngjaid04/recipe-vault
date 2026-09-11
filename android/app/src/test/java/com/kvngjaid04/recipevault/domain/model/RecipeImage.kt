package com.kvngjaid04.recipevault.domain.model

data class RecipeImage(
    val id: Long = 0,
    val recipeId: Long,
    val imagePath: String
)
