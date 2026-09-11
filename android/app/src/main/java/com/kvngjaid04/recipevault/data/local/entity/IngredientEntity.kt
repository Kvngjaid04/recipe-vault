package com.kvngjaid04.recipevault.data.local.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import androidx.room.Index
import com.kvngjaid04.recipevault.domain.model.UnitType

@Entity(
    tableName = "ingredients",
    indices = [Index("recipeId")],
    foreignKeys = [
        ForeignKey(
            entity = RecipeEntity::class,
            parentColumns = ["id"],
            childColumns = ["recipeId"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class IngredientEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val recipeId: Long,
    val catalogId: Long,
    val quantity: Double,
    val unit: String,
    val unitType: UnitType
)