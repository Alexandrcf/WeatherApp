package com.alex.weatherapp.ui.fragments

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alex.weatherapp.domain.models.JsonDataClass
import com.alex.weatherapp.domain.useCase.GetTemperatureUseCase
import kotlinx.coroutines.*

class MainViewModel(
    private val getTemperatureUseCase: GetTemperatureUseCase
) : ViewModel() {

    private val coroutineScope = CoroutineScope(Dispatchers.Default + CoroutineName("My coroutine scope"))

    val temperatureApiLiveData: MutableLiveData<List<JsonDataClass>> by lazy {
        MutableLiveData<List<JsonDataClass>>()
    }

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

    override fun onCleared() {
        super.onCleared()
        coroutineScope.cancel()
    }
}