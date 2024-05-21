package com.ms.setup_requestqueue_volley

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.toolbox.BasicNetwork
import com.android.volley.toolbox.DiskBasedCache
import com.android.volley.toolbox.HurlStack
import com.android.volley.toolbox.StringRequest
import com.ms.setup_requestqueue_volley.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Instantiate the cache
        val cache = DiskBasedCache(cacheDir, 1024 * 1024) // 1MB cap

        // Set up the network to use HttpURLConnection as the HTTP client.
        val network = BasicNetwork(HurlStack())

        // Instantiate the RequestQueue with the cache and network. Start the queue.
        val requestQueue = RequestQueue(cache, network).apply {
            start()
        }

        val url = "http://www.google.com"

        // Formulate the request and handle the response.
        val stringRequest = StringRequest(
            Request.Method.GET, url,
            { response ->
                // Do something with the response
                binding.tvShow.text = "Response is $response"
            },
            { error ->
                // Handle error
                binding.tvShow.text = "ERROR: %s".format(error.toString())
            })

            // Add the request to the RequestQueue.
            requestQueue.add(stringRequest)
    }
}