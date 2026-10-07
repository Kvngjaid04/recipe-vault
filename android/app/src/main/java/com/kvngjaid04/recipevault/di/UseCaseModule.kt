package com.kvngjaid04.recipevault.di

import com.kvngjaid04.recipevault.domain.repository.RecipeRepository
import com.kvngjaid04.recipevault.domain.usecase.SaveRecipeUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    fun provideSaveRecipeUseCase(
        repository: RecipeRepository
    ): SaveRecipeUseCase {
        return SaveRecipeUseCase(repository)
    }
}
