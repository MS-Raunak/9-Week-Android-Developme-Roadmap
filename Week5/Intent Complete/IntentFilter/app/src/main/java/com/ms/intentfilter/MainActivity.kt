package com.ms.intentfilter

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.ms.intentfilter.databinding.ActivityMainBinding

// HandleUrlActivity.kt
class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val sendButton = binding.sendButton
        val buttonView = binding.buttonView
        // send button on click listener
        sendButton.setOnClickListener {
            var intent = Intent(Intent.ACTION_SEND) // intent
            intent.type = "text/plain"
            intent.putExtra(Intent.EXTRA_EMAIL, "uraunak90@gmail.com")
            intent.putExtra(Intent.EXTRA_SUBJECT, "This is a dummy message")
            intent.putExtra(Intent.EXTRA_TEXT, "Dummy test message")
            startActivity(intent)
        }

        // View on click listener
        buttonView.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW)
            startActivity(intent)
        }

    }
}
