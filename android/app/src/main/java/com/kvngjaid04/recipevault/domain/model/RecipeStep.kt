package com.kvngjaid04.recipevault.domain.model

data class RecipeStep(
    val id: Long = 0,
    val recipeId: Long,
    val stepNumber: Int,
    val title: String?,
    val instruction: String,
    val timerMinutes: Int? = null
)