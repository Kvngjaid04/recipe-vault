package com.kvngjaid04.recipevault.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.kvngjaid04.recipevault.data.local.dao.RecipeDao
import com.kvngjaid04.recipevault.data.local.dao.IngredientDao
import com.kvngjaid04.recipevault.data.local.dao.RecipeStepDao
import com.kvngjaid04.recipevault.data.local.entity.*

@Database(
    entities = [
        RecipeEntity::class,
        IngredientEntity::class,
        IngredientCatalogEntity::class,
        RecipeStepEntity::class,
        RecipeVariationEntity::class,
        RecipeSourceEntity::class
    ],
    version = 1
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun recipeDao(): RecipeDao
    abstract fun ingredientDao(): IngredientDao
    abstract fun recipeStepDao(): RecipeStepDao
}