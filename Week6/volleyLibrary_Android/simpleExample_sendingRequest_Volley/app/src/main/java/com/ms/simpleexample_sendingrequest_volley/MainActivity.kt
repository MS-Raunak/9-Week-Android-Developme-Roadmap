package com.ms.simpleexample_sendingrequest_volley

import android.app.ProgressDialog
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.ms.simpleexample_sendingrequest_volley.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnClick.setOnClickListener {
            fetchData()
        }
    }

    // creating function
    fun fetchData() {
        val progressDialog = ProgressDialog(this)
        progressDialog.setMessage("Please wait while data is fetch")
        progressDialog.show()
        //Instantiate the RequestQueue
        val queue = Volley.newRequestQueue(this)
        val url = "https://www.google.com"


        val stringRequest = StringRequest(Request.Method.GET, url,
            { response ->
                binding.tvShow.text = "Response is $response"
                binding.tvShow.setTextColor(Color.parseColor("#44bd32"))
                progressDialog.dismiss()
            },
            { error ->
                progressDialog.dismiss()
                binding.tvShow.text = "Something error found!"
                binding.tvShow.setTextColor(Color.parseColor("#e84118"))
            })
        queue.add(stringRequest)
    }
}