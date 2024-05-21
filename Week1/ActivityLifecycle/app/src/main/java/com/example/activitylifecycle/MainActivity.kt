package com.example.activitylifecycle

import android.content.ContentValues.TAG
import android.content.Intent
import android.nfc.Tag
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    val TAG = "Activity 1"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG,"Oncreate")
        setContentView(R.layout.activity_main)

        var btn_main = findViewById<Button>(R.id.btn_main1)
        var nextActivity = Intent(this,MainActivity2::class.java)
        btn_main.setOnClickListener(View.OnClickListener {
            startActivity(nextActivity)
        })
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG,"onRestart")
        Toast.makeText(this,"onRestart", Toast.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"onCreate")
        Toast.makeText(this,"onStart", Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"onResume")
        Toast.makeText(this,"onResume", Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"onPause")
        Toast.makeText(this,"onPause", Toast.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"onStop")
        Toast.makeText(this,"onStop", Toast.LENGTH_LONG).show()

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"onDestroy")
        Toast.makeText(this,"onDestroy", Toast.LENGTH_LONG).show()
    }
}