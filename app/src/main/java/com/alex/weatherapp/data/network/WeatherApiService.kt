package com.alex.weatherapp.data.network

import com.alex.weatherapp.domain.models.ForecastDto
import retrofit2.Response
import retrofit2.http.GET

interface WeatherApiService {

    @GET("v1/forecast?latitude=52.52&longitude=13.41&hourly=temperature_2m")
    suspend fun getForecast(): Response<ForecastDto>
}