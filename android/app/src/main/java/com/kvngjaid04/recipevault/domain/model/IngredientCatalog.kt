package com.kvngjaid04.recipevault.domain.model

data class IngredientCatalog(
    val id: Long = 0,
    val name: String,
    val imageUrl: String? = null,
    val imagePath: String? = null,
    val aliases: List<String> = emptyList(),
    val category: String? = null
)