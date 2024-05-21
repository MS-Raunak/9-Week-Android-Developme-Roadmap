package com.ms.observer_lifecyclecomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lifecycle.addObserver(Observer())
        Log.d("Main", "MainActivity- onCreate")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Main", "MainActivity- onPause")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Main", "MainActivity- onResume")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Main", "MainActivity- onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Main", "MainActivity- onDestroy")
    }
}