package com.kvngjaid04.recipevault.domain.model

data class Recipe(
    val id: Long = 0,
    val title: String,
    val instructions: String,
    val servings: Int,
    val cookTimeMinutes: Int = 0,
    val category: String = "All",
    val imageUrl: String? = null,
    val favorite: Boolean = false,
    val createdAt: Long = System.currentTimeMillis(),
    val updatedAt: Long = System.currentTimeMillis()
)