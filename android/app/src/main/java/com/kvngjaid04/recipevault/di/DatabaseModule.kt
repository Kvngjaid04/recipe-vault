package com.kvngjaid04.recipevault.di

import android.content.Context
import androidx.room.Room
import com.kvngjaid04.recipevault.data.local.dao.IngredientDao
import com.kvngjaid04.recipevault.data.local.dao.RecipeDao
import com.kvngjaid04.recipevault.data.local.dao.RecipeStepDao
import com.kvngjaid04.recipevault.data.local.dao.RecipeVariationDao
import com.kvngjaid04.recipevault.data.local.database.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(
        @ApplicationContext context: Context
    ): AppDatabase {
        return Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            "recipe_vault.db"
        ).build()
    }

    @Provides
    fun provideRecipeDao(
        db: AppDatabase
    ): RecipeDao = db.recipeDao()

    @Provides
    fun provideIngredientDao(
        db: AppDatabase
    ): IngredientDao = db.ingredientDao()

    @Provides
    fun provideRecipeStepDao(
        db: AppDatabase
    ): RecipeStepDao = db.recipeStepDao()

    @Provides
    fun provideRecipeVariationDao(
        db: AppDatabase
    ): RecipeVariationDao = db.recipeVariationDao()
}