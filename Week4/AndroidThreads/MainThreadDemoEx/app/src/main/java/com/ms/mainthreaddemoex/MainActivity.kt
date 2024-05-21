package com.ms.mainthreaddemoex

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvMsg = findViewById<TextView>(R.id.tvShowMsg)
        val btnStart = findViewById<Button>(R.id.btnStart)

        btnStart.setOnClickListener {

            // creating main thread
            val thread = Thread(Runnable {
                while (true) {
                    runOnUiThread() {
                        tvMsg.text = "Hello"
                    }

                    Thread.sleep(1000)
                    runOnUiThread() {
                        tvMsg.text = "Hello Guys"
                    }
                    Thread.sleep(1000)
                }
            }).start()
        }
    }
}