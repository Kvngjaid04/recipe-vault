package com.kvngjaid04.recipevault

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.kvngjaid04.recipevault.presentation.recipe_list.RecipeListScreen
import com.kvngjaid04.recipevault.ui.theme.RecipeVaultTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            RecipeVaultTheme {
                RecipeListScreen()
            }
        }
    }
}