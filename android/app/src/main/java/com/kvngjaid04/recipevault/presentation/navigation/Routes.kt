package com.kvngjaid04.recipevault.presentation.navigation

sealed class Routes(val route: String) {
    data object RecipeList : Routes("recipe_list")
    data object AddRecipe : Routes("add_recipe")
    data object RecipeDetail : Routes("recipe_detail")
}
