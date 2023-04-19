package com.alex.weatherapp.domain.repository

import com.alex.weatherapp.domain.models.JsonDataClass

interface WeatherRepository {

    suspend fun getTemperature(): JsonDataClass?
}