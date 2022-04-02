package com.mkao.livedatasample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewmodel:ViewModel() {

    val liveDataCounter = MutableLiveData<Int>()

    var i = 0

    fun increaseNumber(){
        liveDataCounter.postValue(i++)
    }
}