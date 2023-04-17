package com.alex.weatherapp.data.network

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {

    val apiService: ApiService by lazy {
        Retrofit.Builder()
            .baseUrl("https://api.open-meteo.com/")
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .build().create(ApiService::class.java)
    }
}