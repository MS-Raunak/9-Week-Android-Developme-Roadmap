package com.example.viewexample

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnShow = findViewById<Button>(R.id.btnShowToast)
        val message = findViewById<EditText>(R.id.etUserMessage)
        val btnIntent = findViewById<Button>(R.id.btnSendMessageToNextActivity)
        val btnShareToOtherApp = findViewById<Button>(R.id.btnSharetoOther)
        val btnRecyclerView = findViewById<Button>(R.id.btnRecycler)
        val txvTitle = findViewById<TextView>(R.id.txvTitle)

        btnShow.setOnClickListener {
            Log.i("MainActivity", "Button Clicked")
            Toast.makeText(this, "Button Clicked", Toast.LENGTH_LONG).show()
        }

        // Implicit Intent
        btnIntent.setOnClickListener {
            val msg : String = message.text.toString()
            Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
            // Intent Passing in new Activity:
            // Share data using explicit intent
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("user_message", msg)
            startActivity(intent)
        }

        // Explicit Intent => share to the other apps
        btnShareToOtherApp.setOnClickListener {
            val msg: String = etUserMessage.text.toString()

            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, msg)
            intent.type = "text/plain"
            val str: String = "Please select app: "

            startActivity(Intent.createChooser(intent, "$str"))
        }

        // Recycler View

        btnRecyclerView.setOnClickListener {
            val intent = Intent(this, HobbiesActivity::class.java)
            startActivity(intent)
        }
    }
}
