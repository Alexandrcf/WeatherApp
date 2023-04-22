package com.alex.weatherapp.domain.useCase

import com.alex.weatherapp.domain.models.ForecastDto
import com.alex.weatherapp.domain.repository.WeatherRepository

class GetTemperatureUseCase(private val repositoryWeather: WeatherRepository) {

    suspend operator fun invoke(): ForecastDto? {
        return repositoryWeather.getTemperature()
    }
}