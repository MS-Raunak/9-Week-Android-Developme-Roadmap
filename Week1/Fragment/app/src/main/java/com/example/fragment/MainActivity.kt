package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)

        btn1.setOnClickListener(View.OnClickListener {
            loadFragmentOne(Fragment_One())
        })

        btn2.setOnClickListener(View.OnClickListener {
            loadFragmentTwo(Fragment_Two())
        })
    }

    fun loadFragmentOne(frag1 : Fragment_One){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment,frag1)
        ft.commit()
    }

    fun loadFragmentTwo(frag2 : Fragment_Two){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment,frag2)
        ft.commit()
    }
}