package com.alex.weatherapp.data.network

import com.alex.weatherapp.domain.models.JsonDataClass
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("v1/forecast?latitude=52.52&longitude=13.41&hourly=temperature_2m")
    suspend fun getData(): Response<JsonDataClass>
}