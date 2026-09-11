package com.kvngjaid04.recipevault.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "recipes")
data class RecipeEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,

    val title: String,

    val instructions: String,

    val servings: Int,

    val favorite: Boolean = false,

    val createdAt: Long,

    val updatedAt: Long
)