package com.kvngjaid04.recipevault.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "ingredient_catalog")
data class IngredientCatalogEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,

    val name: String,

    val imageUrl: String?,

    val imagePath: String?,

    val category: String?
)