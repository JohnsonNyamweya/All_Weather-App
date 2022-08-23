package com.nyamweyajohnson.all_weather.Weather

data class WeatherData(
    val city: City,
    val cnt: Int,
    val cod: String,
    //added type of list???
    val list: List<Weather>,
    val message: Int
)