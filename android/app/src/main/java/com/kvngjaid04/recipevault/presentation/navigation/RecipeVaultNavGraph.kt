package com.kvngjaid04.recipevault.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.*
import com.kvngjaid04.recipevault.presentation.add_recipe.AddRecipeScreen
import com.kvngjaid04.recipevault.presentation.recipe_list.RecipeListScreen

@Composable
fun RecipeVaultNavGraph() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.RecipeList.route
    ) {
        composable(Routes.RecipeList.route) {
            RecipeListScreen(
                onAddRecipe = {
                    navController.navigate(Routes.AddRecipe.route)
                }
            )
        }

        composable(Routes.AddRecipe.route) {
            AddRecipeScreen(
                onSave = {
                    navController.popBackStack()
                }
            )
        }
    }
}
