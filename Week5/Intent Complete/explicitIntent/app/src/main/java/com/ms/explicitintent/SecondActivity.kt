package com.ms.explicitintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ms.explicitintent.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    lateinit var binding : ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_second)

        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle : Bundle? = intent.extras
        val msg = bundle!!.getString("user_message")
        val name = bundle!!.getString("user_name")
        val id = bundle!!.getInt("user_id")
        binding.msg.text = msg
        binding.name.text = name
        binding.id.text= id.toString()
    }
}