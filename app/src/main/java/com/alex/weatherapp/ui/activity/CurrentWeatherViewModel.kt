package com.alex.weatherapp.ui.activity

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alex.weatherapp.domain.models.ForecastDto
import com.alex.weatherapp.domain.useCase.GetTemperatureUseCase
import kotlinx.coroutines.*

class CurrentWeatherViewModel(
    private val getTemperatureUseCase: GetTemperatureUseCase
) : ViewModel() {

    val temperatureApiLiveData: MutableLiveData<List<ForecastDto>> = MutableLiveData<List<ForecastDto>>()

    fun getTemperatureFromApi() {
        viewModelScope.launch {
            try {
                //TODO
                //temperatureApiLiveData.value = getTemperatureUseCase.execute()
            }
            catch (e: Exception)
            {
                e.toString()
            }
        }
    }
}