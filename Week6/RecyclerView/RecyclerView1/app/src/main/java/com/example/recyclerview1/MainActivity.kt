package com.example.recyclerview1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var main_item = findViewById<RecyclerView>(R.id.main_item)

        val songObject = mutableListOf<Song>()
        songObject.add(Song("AAA","bb"))
        songObject.add(Song("BBB","bb"))
        songObject.add(Song("CCC","cc"))
        songObject.add(Song("AAA","bb"))
        songObject.add(Song("BBB","bb"))
        songObject.add(Song("CCC","cc"))
        songObject.add(Song("AAA","bb"))
        songObject.add(Song("BBB","bb"))
        songObject.add(Song("CCC","cc"))
        songObject.add(Song("AAA","bb"))
        songObject.add(Song("BBB","bb"))
        songObject.add(Song("CCC","cc"))
        songObject.add(Song("AAA","bb"))
        songObject.add(Song("BBB","bb"))
        songObject.add(Song("CCC","cc"))


        main_item.adapter = MyAdapter(songObject)
        main_item.layoutManager = LinearLayoutManager(this)
    }
}