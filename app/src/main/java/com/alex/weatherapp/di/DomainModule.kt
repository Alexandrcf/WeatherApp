package com.alex.weatherapp.di

import com.alex.weatherapp.domain.useCase.GetTemperatureUseCase
import org.koin.dsl.module

val domainModule = module {
    factory<GetTemperatureUseCase> {
        GetTemperatureUseCase(repositoryWeather = get())
    }
}