package com.nyamweyajohnson.all_weather.Model

import com.google.gson.annotations.SerializedName
import com.nyamweyajohnson.all_weather.Weather.Main
import com.nyamweyajohnson.all_weather.Weather.Sys
import com.nyamweyajohnson.all_weather.Weather.Weather
import com.nyamweyajohnson.all_weather.Weather.Wind

data class ModelClass(
    @SerializedName("weather") val weather: List<Weather>,
    @SerializedName("main") val main: Main,
    @SerializedName("wind") val wind: Wind,
    @SerializedName("sys") val sys: Sys,
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String
)
