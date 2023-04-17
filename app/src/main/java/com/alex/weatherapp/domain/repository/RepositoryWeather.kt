package com.alex.weatherapp.domain.repository

import com.alex.weatherapp.domain.models.JsonDataClass

interface RepositoryWeather {

    suspend fun getTemperature(): JsonDataClass?
}