package com.ms.pendingintent

// MainActivity.kt

import android.app.PendingIntent
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.btnNotification)

        // Create the Intent for the new Activity
        val intent = Intent(this, SecondActivity::class.java)

        // Create the PendingIntent
        val pendingIntent = PendingIntent.getActivity(this, 0, intent, 0)

        // Set the PendingIntent as the onClickListener for the button
        button.setOnClickListener {
            try {
                pendingIntent.send()
            } catch (e: PendingIntent.CanceledException) {
                e.printStackTrace()
            }
        }
    }

    // NewActivity will be launched by the PendingIntent
}

