package com.example.activitylife_cycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import kotlin.math.log

class SecondActivity : AppCompatActivity() {

    val TAG = "SecondActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        Log.d(TAG, "Oncreate method called")
    }

    override fun onStart() {
        Log.d(TAG, "onStart method called")
        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG, "onResume method called")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG, "onPause method called")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG, "onStop method called")
        super.onStop()
    }

    override fun onRestart() {
        Log.d(TAG, "onStart method called")
        super.onRestart()
    }

    override fun onDestroy() {
        Log.d(TAG, "onDestroy method called")
        super.onDestroy()
    }
}