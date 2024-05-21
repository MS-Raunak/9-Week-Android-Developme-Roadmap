package com.ms.databindingadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.ms.databindingadapter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val post = Post("Kotlin", "JetBrains: Andrey bracelav",
            "https://hsto.org/files/c29/a51/0ef/c29a510efb444bb4bc8b18f8ad740523.jpg")

        binding.postVariable = post
    }
}