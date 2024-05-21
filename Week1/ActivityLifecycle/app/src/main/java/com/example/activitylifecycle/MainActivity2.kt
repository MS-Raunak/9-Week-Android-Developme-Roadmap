package com.example.activitylifecycle

import android.content.ContentValues
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {

    val TAG = "Activity 2"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2 )
                Log.d(ContentValues.TAG,"onCreate")
        Toast.makeText(this,"onCreate", Toast.LENGTH_LONG).show()
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(ContentValues.TAG,"onRestart")
        Toast.makeText(this,"onRestart", Toast.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()
        Log.d(ContentValues.TAG,"onCreate")
        Toast.makeText(this,"onCreate", Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d(ContentValues.TAG,"onResume")
        Toast.makeText(this,"onResume", Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        Log.d(ContentValues.TAG,"onPause")
        Toast.makeText(this,"onPause", Toast.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        Log.d(ContentValues.TAG,"onStop")
        Toast.makeText(this,"onStop", Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(ContentValues.TAG,"onDestroy")
        Toast.makeText(this,"onDestroy", Toast.LENGTH_LONG).show()
    }
}