package com.alex.weatherapp.domain.useCase

import com.alex.weatherapp.domain.models.JsonDataClass
import com.alex.weatherapp.domain.repository.WeatherRepository

class GetTemperatureUseCase(private val repositoryWeather: WeatherRepository) {

    suspend fun execute(): JsonDataClass? {
        return repositoryWeather.getTemperature()
    }
}