package com.ms.databinding_with_livedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val quoteLiveData  = MutableLiveData<String>("Hey Guys, I'm ready to update!")

    fun updateData(){
        quoteLiveData.value = "HaHa, I'm Updated!"
    }
}
