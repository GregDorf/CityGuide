package com.example.cityguide

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.Categories.route) {
        composable(route = Screen.Categories.route) {
            Categories(navController)
        }
        composable(route = Screen.Places.route + "/{categoryName}") { backStackEntry ->
            val categoryName = backStackEntry.arguments?.getString("categoryName")
            categoryName?.let {
                Places(navController, com.example.cityguide.ui.theme.Categories.valueOf(it))
            }
        }
        composable(route = Screen.PlaceDetails.route + "/{placeId}") { backStackEntry ->
            val placeId = backStackEntry.arguments?.getString("placeId")?.toIntOrNull()
            placeId?.let {
                PlaceDetails(navController, it)
            }
        }
    }
}


@Preview(
    name = "Default Preview",
    showBackground = true,
)
@Composable
fun DefaultPreview() {
    setDefaultPlaces()
    val navController = rememberNavController()
    PlaceDetails(navController, 0)
}
