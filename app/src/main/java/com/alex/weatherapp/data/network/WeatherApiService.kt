package com.alex.weatherapp.data.network

import com.alex.weatherapp.domain.models.ForecastDto
import retrofit2.Response
import retrofit2.http.GET

interface WeatherApiService {

    @GET("v1/forecast?latitude=60.04&longitude=30.21&hourly=temperature_2m,rain&current_weather=true&timezone=Europe%2FMoscow")
    suspend fun getForecast(): Response<ForecastDto>
}