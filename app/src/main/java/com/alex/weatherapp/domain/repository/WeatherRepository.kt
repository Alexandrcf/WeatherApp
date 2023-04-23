package com.alex.weatherapp.domain.repository

import com.alex.weatherapp.domain.models.ForecastDto

interface WeatherRepository {

    suspend fun getTemperature(): ForecastDto?
}