package com.example.weatherapppp.service

data class WeatherResponse(val main: Main) {
    data class Main(
        val temp: Double,
        val pressure: Int,
        val humidity: Int,
    )
}