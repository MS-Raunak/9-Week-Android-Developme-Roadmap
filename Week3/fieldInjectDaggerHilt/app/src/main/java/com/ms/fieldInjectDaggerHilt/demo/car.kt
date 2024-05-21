package com.ms.fieldInjectDaggerHilt.demo

import android.util.Log
import android.widget.Toast
import javax.inject.Inject

class car  {
    @Inject
    constructor()
    fun getCar() : String{
        Log.d("main", "Car is Running")
        return "Car is Running"
    }
}