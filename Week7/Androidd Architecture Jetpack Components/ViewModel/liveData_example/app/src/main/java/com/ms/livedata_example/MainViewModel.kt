package com.ms.livedata_example

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
     val factsLiveDataObject = MutableLiveData<String>("Mutable Live Data") // can update to the mutableLiveData

    val factsLiveData : LiveData<String>
    get() = factsLiveDataObject

    fun updateLiveData(){
        factsLiveDataObject.value = "Updated Data"
    }
}