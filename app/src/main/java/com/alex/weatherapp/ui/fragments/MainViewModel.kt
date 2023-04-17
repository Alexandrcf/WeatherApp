package com.alex.weatherapp.ui.fragments

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alex.weatherapp.domain.models.JsonDataClass
import kotlinx.coroutines.*

class MainViewModel() : ViewModel() {

    private val coroutineScope = CoroutineScope(Dispatchers.Default + CoroutineName("My coroutine scope"))


    val temperatureApiLiveData: MutableLiveData<List<JsonDataClass>> by lazy {
        MutableLiveData<List<JsonDataClass>>()
    }

    fun getBotsFromApi() {
        viewModelScope.launch {

        }
    }

    override fun onCleared() {
        super.onCleared()
        coroutineScope.cancel()
    }
}