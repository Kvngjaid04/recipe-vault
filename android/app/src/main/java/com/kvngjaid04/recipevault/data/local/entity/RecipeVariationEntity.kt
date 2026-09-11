package com.kvngjaid04.recipevault.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "recipe_variations")
data class RecipeVariationEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,

    val recipeId: Long,

    val name: String,

    val description: String,

    val createdAt: Long
)