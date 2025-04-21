package com.example.cityguide.ui.theme
import com.example.cityguide.R

enum class Categories(val imageRes: Int, val sec_name: String) {
    ENTERTAINMENT(R.drawable.gorkiypark, "Развлечения"),
    LANDMARK(R.drawable.pelmenlandmark, "Достопремечательности"),
    EATERY(R.drawable.cafekamaeatery, "Общепит"),
    HOTEL(R.drawable.panoramahotel, "Отели")
}

data class PlaceData(val category: Categories, val name: String, val details: String, val id: Int, val imageRes: Int)

var listPlaces = mutableListOf<PlaceData>()

fun getPlacesForCategory(categoryName: Categories): List<PlaceData> {
    return listPlaces.filter { it.category == categoryName }
}

fun getPlaceById(placeId: Int): PlaceData? {
    return listPlaces.find { it.id == placeId }
}