package com.alex.weatherapp.data.repository

import com.alex.weatherapp.data.network.WeatherApiService
import com.alex.weatherapp.data.network.RetrofitClient
import com.alex.weatherapp.domain.models.JsonDataClass
import com.alex.weatherapp.domain.repository.WeatherRepository

class WeatherRepositoryImpl() : WeatherRepository {

    private var client: WeatherApiService = RetrofitClient().apiService

    override suspend fun getTemperature(): JsonDataClass? {
        try {
            return client.getForecast().body()
        } catch (e: Exception) {
            e.toString()
            throw  e
        }
    }
}