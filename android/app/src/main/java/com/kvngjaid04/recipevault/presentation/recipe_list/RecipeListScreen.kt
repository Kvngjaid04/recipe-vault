package com.kvngjaid04.recipevault.presentation.recipe_list

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun RecipeListScreen(
    viewModel: RecipeListViewModel = hiltViewModel()
) {

    val recipes =
        viewModel.recipes.collectAsState()

    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp)
    ) {

        items(recipes.value) { recipe ->

            Text(
                text = recipe.title,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}