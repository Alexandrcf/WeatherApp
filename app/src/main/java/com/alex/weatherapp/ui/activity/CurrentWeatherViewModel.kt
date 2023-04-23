package com.alex.weatherapp.ui.activity

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alex.weatherapp.domain.models.ForecastDto
import com.alex.weatherapp.domain.useCase.GetTemperatureUseCase
import kotlinx.coroutines.*

class CurrentWeatherViewModel(
    private val getTemperatureUseCase: GetTemperatureUseCase
) : ViewModel() {

    val temperatureApiLiveData: MutableLiveData<Int> = MutableLiveData<Int>()

    fun getTemperatureFromApi() {
        Log.d("MyLog", "CurrentWeatherViewModel")
        viewModelScope.launch {
            try {
                Log.d("MyLog", "viewModelScope")
                temperatureApiLiveData.value = getTemperatureUseCase.invoke()?.temperature
            }
            catch (e: Exception)
            {
                e.toString()
            }
        }
    }
}