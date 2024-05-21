package com.example.viewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val txtShow = findViewById<TextView>(R.id.txtShowPassingMessage)

        val bundle : Bundle ? = intent.extras
        val message = bundle!!.getString("user_message")
        txtShow.text =message
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
}