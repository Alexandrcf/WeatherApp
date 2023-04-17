package com.alex.weatherapp.di

import com.alex.weatherapp.ui.fragments.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    viewModel<MainViewModel>{
        MainViewModel(

        )
    }
}