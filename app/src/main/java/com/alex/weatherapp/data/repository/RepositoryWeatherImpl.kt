package com.alex.weatherapp.data.repository

import com.alex.weatherapp.data.network.ApiService
import com.alex.weatherapp.data.network.RetrofitClient
import com.alex.weatherapp.domain.models.JsonDataClass
import com.alex.weatherapp.domain.repository.RepositoryWeather

class RepositoryWeatherImpl() : RepositoryWeather {

    private var client: ApiService = RetrofitClient().apiService

    override suspend fun getTemperature(): JsonDataClass? {
        try {
            return client.getData().body()
        } catch (e: Exception) {
            e.toString()
            throw  e
        }
    }
}