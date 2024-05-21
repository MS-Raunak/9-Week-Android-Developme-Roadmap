package com.example.activitylife_cycle

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.ActionMode
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Log.d(TAG, "onCreate method called")
        //showToast("onCreate() Method Called")


        val btnIntent = findViewById<Button>(R.id.btnIntent)
        btnIntent.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)

        })
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart method called")
        //showToast("onStart() method called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume method called")
//        showToast("onResume() method called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause method called")
        //showToast("onPause() method called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop method called")
        //showToast("onStop() method called")
    }


    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart method called")
        //showToast("onRestart() method called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy method called")
        //showToast("onDestroy() method called")
    }

    private fun showToast(str: String){
        Toast.makeText(this,"$str", Toast.LENGTH_LONG).show()
    }
}