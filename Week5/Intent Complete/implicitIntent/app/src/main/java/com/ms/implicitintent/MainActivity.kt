package com.ms.implicitintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ms.implicitintent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.mob.setOnClickListener{
            val intentMob = Intent(Intent.ACTION_DIAL, Uri.parse("tel:8809197034"))  // for phone call
            startActivity(intentMob)
        }

        binding.map.setOnClickListener{
            val intentMap = Intent(Intent.ACTION_VIEW, Uri.parse("geo:20.42222, -100.83984?z=10"))  // for Map
            startActivity(intentMap)
        }

        binding.fb.setOnClickListener{
            val intentFacebook = Intent(Intent.ACTION_VIEW, Uri.parse("https://facebook.com"))  // for source link( any kind of)
            startActivity(intentFacebook)
        }

        binding.google.setOnClickListener{
            val intentGoogle = Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com"))
            startActivity(intentGoogle)
        }

        binding.share.setOnClickListener{
            val intentShareEmail = Intent(Intent.ACTION_SEND, Uri.parse("raunakkr.saha@gmail.com"))
            intentShareEmail.type = "text/plain"
            intentShareEmail.putExtra(Intent.EXTRA_EMAIL, "Youtube")
            intentShareEmail.putExtra(Intent.EXTRA_SUBJECT, "Android App")
//            intentShareEmail.putExtra(Intent.EXTRA_TEXT,"Something")
            startActivity(intentShareEmail)
        }

        binding.share.setOnClickListener {
            val intentTextShare = Intent(Intent.ACTION_SEND)
            intentTextShare.putExtra(Intent.EXTRA_TEXT, "Explicit Passing")
            intentTextShare.type = "text/plain"
            startActivity(intentTextShare)
        }

    }
}