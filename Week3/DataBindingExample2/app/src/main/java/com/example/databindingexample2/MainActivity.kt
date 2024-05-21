package com.example.databindingexample2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.databinding.DataBindingUtil
import com.example.databindingexample2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btn.setOnClickListener(View.OnClickListener {
            val num1 = binding.num1.text.toString().toInt()
            val num2 = binding.num2.text.toString().toInt()
            val sum = num1 + num2
            binding.txtResult.text = "Sum: $sum"

        })



    }
}