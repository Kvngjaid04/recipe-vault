package com.kvngjaid04.recipevault.di

import com.kvngjaid04.recipevault.data.local.dao.IngredientDao
import com.kvngjaid04.recipevault.data.local.dao.RecipeDao
import com.kvngjaid04.recipevault.data.local.dao.RecipeStepDao
import com.kvngjaid04.recipevault.data.local.dao.RecipeVariationDao
import com.kvngjaid04.recipevault.data.repository.RecipeRepositoryImpl
import com.kvngjaid04.recipevault.domain.repository.RecipeRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    fun provideRecipeRepository(
        recipeDao: RecipeDao,
        ingredientDao: IngredientDao,
        recipeStepDao: RecipeStepDao,
        recipeVariationDao: RecipeVariationDao
    ): RecipeRepository {

        return RecipeRepositoryImpl(
            recipeDao,
            ingredientDao,
            recipeStepDao,
            recipeVariationDao
        )
    }
}