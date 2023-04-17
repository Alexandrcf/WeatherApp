package com.alex.weatherapp.domain.useCase

import com.alex.weatherapp.domain.models.JsonDataClass
import com.alex.weatherapp.domain.repository.RepositoryWeather

class GetTemperatureUseCase(private val repositoryWeather: RepositoryWeather) {

    suspend fun execute(): JsonDataClass? {
        return repositoryWeather.getTemperature()
    }
}