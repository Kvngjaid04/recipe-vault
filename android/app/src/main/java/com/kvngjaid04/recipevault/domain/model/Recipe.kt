package com.kvngjaid04.recipevault.domain.model

data class Recipe(
    val id: Long = 0,
    val title: String,
    val instructions: String,
    val servings: Int,
    val favorite: Boolean = false
)