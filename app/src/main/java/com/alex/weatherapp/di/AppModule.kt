package com.alex.weatherapp.di

import com.alex.weatherapp.ui.activity.CurrentWeatherViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    viewModel<CurrentWeatherViewModel>{
        CurrentWeatherViewModel(
            getTemperatureUseCase = get()
        )
    }
}