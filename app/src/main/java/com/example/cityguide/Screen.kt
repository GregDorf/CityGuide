package com.example.cityguide

sealed class Screen(val route: String) {
    object MainScreen : Screen("main_screen")
    object Categories : Screen("categories")
    object Places : Screen("places")
    object PlaceDetails : Screen("place_details")
}
