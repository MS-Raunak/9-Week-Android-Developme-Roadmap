package com.example.scrollabletextview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var hello_world2TextView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        hello_world2TextView = findViewById<TextView>(R.id.hello_world2)
        hello_world2TextView.setOnClickListener(View.OnClickListener {
            hello_world2TextView.text = "this is a dummy text about dummy written by dummy.this is a dummy text about dummy written by dummy.this is a dummy text about dummy written by dummy."
            hello_world2TextView.setSingleLine()
            hello_world2TextView.ellipsize= TextUtils.TruncateAt.MARQUEE
            hello_world2TextView.marqueeRepeatLimit = -1
            hello_world2TextView.isSelected = true
        })
    }
}