package com.example.viewbindingcalculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewbindingcalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

//        setContentView(R.layout.activity_main)
        setContentView(binding.root)

        binding.btnSum.setOnClickListener {
            binding.txtResult.text =
                (binding.num1.text.toString().toInt() + binding.num2.text.toString()
                    .toInt()).toString()

        }

        binding.btnSub.setOnClickListener {
            binding.txtResult.text =
                (binding.num1.text.toString().toInt() - binding.num2.text.toString()
                    .toInt()).toString()
        }

        binding.btnMul.setOnClickListener {
            binding.txtResult.text =
                (binding.num1.text.toString().toInt() * binding.num2.text.toString()
                    .toInt()).toString()
        }

        binding.btnDiv.setOnClickListener {
            binding.txtResult.text =
                (binding.num1.text.toString().toInt() / binding.num2.text.toString()
                    .toInt()).toString()
        }
    }
}