package com.alex.weatherapp.di

import com.alex.weatherapp.data.repository.WeatherRepositoryImpl
import com.alex.weatherapp.domain.repository.WeatherRepository
import org.koin.dsl.module

val dataModule = module {
    factory<WeatherRepository> {
        WeatherRepositoryImpl(client = get())
    }
}