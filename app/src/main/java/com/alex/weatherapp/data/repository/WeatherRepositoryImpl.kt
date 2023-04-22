package com.alex.weatherapp.data.repository

import com.alex.weatherapp.data.network.WeatherApiService
import com.alex.weatherapp.domain.models.ForecastDto
import com.alex.weatherapp.domain.repository.WeatherRepository

class WeatherRepositoryImpl(private var client: WeatherApiService) : WeatherRepository {

    override suspend fun getTemperature(): ForecastDto? {
        //TODO
        try {
            return client.getForecast().body()
        } catch (e: Exception) {
            e.toString()
            throw  e
        }
    }
}