package com.example.weatherapppp.repository

import com.example.weatherapppp.service.WeatherService


class WeatherRepo(private val weatherService: WeatherService) {

//    suspend fun getWeatherForecastRepo(cityName:String) =
//        weatherService.getCurrentWeatherForecast(cityName)

    suspend fun searchWeatherRepo(cityName:String) =
        weatherService.searchWeatherByName(cityName)
}