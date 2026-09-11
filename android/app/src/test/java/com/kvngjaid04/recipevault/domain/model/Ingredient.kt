package com.kvngjaid04.recipevault.domain.model

data class Ingredient(
    val id: Long = 0,
    val recipeId: Long,
    val name: String,
    val quantity: Double,
    val unit: String,
    val imageUrl: String? = null,
    val imagePath: String? = null
)