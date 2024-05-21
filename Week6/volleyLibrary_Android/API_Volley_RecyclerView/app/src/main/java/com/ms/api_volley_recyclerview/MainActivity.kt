package com.ms.api_volley_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.ms.api_volley_recyclerview.DataClass.user
import com.ms.api_volley_recyclerview.databinding.ActivityMainBinding
import org.json.JSONObject

class MainActivity : AppCompatActivity() {

    val userList = arrayListOf<user>()
    val urlAPI = "https://reqres.in/api/users"


    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val requestQueue = Volley.newRequestQueue(this)
        val stringRequest = StringRequest(Request.Method.GET, urlAPI,
            { response ->
                var jsonObject = JSONObject(response)
//                binding.tvResult.text = response
                binding.tvResult.text = jsonObject.getString("page")
            },
            { error ->
                Toast.makeText(this, "Data Not Found", Toast.LENGTH_LONG).show()
            })
        requestQueue.add(stringRequest)

    }
}