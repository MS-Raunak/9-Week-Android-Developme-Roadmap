package com.ms.sectionrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ms.sectionrecyclerview.Adapter.myAadapter
import com.ms.sectionrecyclerview.Data_Class.Songs

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val songList = findViewById<RecyclerView>(R.id.songList)

        val songsObj = mutableListOf<Songs>()
        songsObj.add(Songs("Hindi Songs","aaa","bbbb","cccc","dddd"))
        songsObj.add(Songs("English Songs","aaa","bbbb","cccc","dddd"))
        songsObj.add(Songs("Malayalam Songs","aaa","bbbb","cccc","dddd"))
        songsObj.add(Songs("Kannada Songs","aaa","bbbb","cccc","dddd"))
        songsObj.add(Songs("Telugu Songs","aaa","bbbb","cccc","dddd"))
        songsObj.add(Songs("Tamil Songs","aaa","bbbb","cccc","dddd"))
        songsObj.add(Songs("Bhojpuri Songs","aaa","bbbb","cccc","dddd"))
        songsObj.add(Songs("Bengoli Songs","aaa","bbbb","cccc","dddd"))
        songsObj.add(Songs("Uriya Songs","aaa","bbbb","cccc","dddd"))
        songsObj.add(Songs("Nepali Songs","aaa","bbbb","cccc","dddd"))
        songsObj.add(Songs("Marathi Songs","aaa","bbbb","cccc","dddd"))

        songList.adapter = myAadapter(songsObj)
        songList.layoutManager = LinearLayoutManager(this)
    }
}