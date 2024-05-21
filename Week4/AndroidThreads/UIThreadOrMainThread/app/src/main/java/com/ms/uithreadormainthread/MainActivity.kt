package com.ms.uithreadormainthread

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Assigning Layout elements
        val tv = findViewById<TextView>(R.id.tvMsg)
        val btn = findViewById<Button>(R.id.btnStart)
        val msg1 = "Message 1"
        val msg2 = "Message 2"

        // Button onClick action
        btn.setOnClickListener{
            // Declaring Main Thread
            val thread = Thread(Runnable {
                while (true) {
                    // Updating Text View at current
                    // iteration
                    runOnUiThread() {
                        tv.text = msg1
                        Log.d("ActivityMain", "$msg1")
                    }

                    // Thread sleep for 1 sec
                    Thread.sleep(1000)
                    // Updating Text View at current
                    // iteration
                    runOnUiThread()
                    {
                        tv.text = msg2
                        Log.d("ActivityMain", "$msg2")
                    }

                    // Thread sleep for 1 sec
                    Thread.sleep(1000)
                }
            })
            thread.start()
        }
    }
}