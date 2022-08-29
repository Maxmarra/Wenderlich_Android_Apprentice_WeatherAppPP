package com.example.weatherapppp.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.weatherapppp.R
import com.example.weatherapppp.repository.WeatherRepo
import com.example.weatherapppp.service.WeatherService
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class WeatherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather)

        val weatherService = WeatherService.instance
        val weatherRepo = WeatherRepo(weatherService)

        GlobalScope.launch {
//            val results = weatherRepo.getWeatherForecastRepo("London")
//            Log.d(TAG, "Results = ${results.body()}")

            val results = weatherRepo.searchWeatherRepo("London")
            Log.d("WeatherActivity", "Results = ${results.body()}")

            }
    }
}