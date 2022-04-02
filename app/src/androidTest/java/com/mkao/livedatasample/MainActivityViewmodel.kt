package com.mkao.livedatasample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelStore

class MainActivityViewmodel : ViewModel(){
    val livedataCounter = MutableLiveData<Int> ()

    var i = 0

    fun increaseNumber (){
        livedataCounter.postValue(i++)
    }



}
