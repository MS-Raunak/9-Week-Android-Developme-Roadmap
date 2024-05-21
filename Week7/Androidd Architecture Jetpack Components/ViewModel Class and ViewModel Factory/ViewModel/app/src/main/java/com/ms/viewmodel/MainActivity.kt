package com.ms.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    // var count : Int = 0
    lateinit var txtCounter : TextView
    lateinit var mainViewModel: MainViewModel // Instance of ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel = ViewModelProvider(this).get(MainViewModel :: class.java)
        txtCounter = findViewById(R.id.textView)
        setText()
    }
    /*
    fun increment(view : View){
        count++
        setText()

    } */
    fun increment(view: View){
        mainViewModel.increment()  // call to the increment function in mainViewModel Class
        setText()
    }
    fun setText(){
        txtCounter.text =mainViewModel.count.toString()
    }

}