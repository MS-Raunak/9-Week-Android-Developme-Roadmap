package com.ms.viewmodelfactory

import androidx.lifecycle.ViewModel

class MainViewModel(var initialValue : Int) : ViewModel() {
    var count: Int= initialValue

    fun increment(){
        count++
    }
}