package com.alex.weatherapp.di

import com.alex.weatherapp.data.network.WeatherApiService
import com.google.gson.GsonBuilder
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

const val RBT_API_URL = "https://api.open-meteo.com/"

val networkModule = module {
    single<WeatherApiService> {
        Retrofit.Builder()
            .baseUrl(RBT_API_URL)
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .build().create(WeatherApiService::class.java)
    }
}