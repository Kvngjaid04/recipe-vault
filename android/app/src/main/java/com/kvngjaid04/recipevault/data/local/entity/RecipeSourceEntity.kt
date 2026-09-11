package com.kvngjaid04.recipevault.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "recipe_sources")
data class RecipeSourceEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,

    val recipeId: Long,

    val sourceType: String,

    val sourceUrl: String?,

    val importedAt: Long
)