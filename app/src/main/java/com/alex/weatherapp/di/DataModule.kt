package com.alex.weatherapp.di

import com.alex.weatherapp.data.repository.WeatherRepositoryImpl
import org.koin.dsl.module

val dataModule = module {

    factory<WeatherRepositoryImpl> {
        WeatherRepositoryImpl(client = get())
    }
}