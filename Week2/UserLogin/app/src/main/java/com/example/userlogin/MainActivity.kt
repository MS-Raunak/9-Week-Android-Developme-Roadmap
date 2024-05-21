package com.example.userlogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.regex.Pattern


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val email = findViewById<EditText>(R.id.emailEdt)
        val password = findViewById<EditText>(R.id.pwdEdt)
        val btn = findViewById<Button>(R.id.btn)
        val result = findViewById<TextView>(R.id.result)

        btn.setOnClickListener(){
            val pattern = Pattern.compile("[6-9][0-6][9]")
            val emailPattern = android.util.Patterns.EMAIL_ADDRESS
            if (emailPattern.matcher(email.text.toString()).matches() && pattern.matcher(
                    password.toString()
                ).matches() ){
                result.text = "Logged-In"
            }
            else
                result.text = "Invalid email or password"
        }
    }
}