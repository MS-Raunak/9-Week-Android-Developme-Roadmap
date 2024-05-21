package com.ms.databinding_with_livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.ms.databinding_with_livedata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val mainViewModel = ViewModelProvider(this).get(MainViewModel :: class.java)

//        mainViewModel.quoteLiveData.observe(this) {
//            binding.quoteText.text = it
//        }
        binding.lifecycleOwner = this  // when will use binding with livedata then must should be use lifecycleOwner


        binding.mainViewModelVar = mainViewModel
    }
}