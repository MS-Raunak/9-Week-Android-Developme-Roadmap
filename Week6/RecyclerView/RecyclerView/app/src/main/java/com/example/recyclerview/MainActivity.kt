package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import android.widget.LinearLayout
import androidx.constraintlayout.widget.ConstraintSet.Constraint
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val songs = mutableListOf("123", "ABCd", "9999", "7687", "ZZZ")
        songs.add("AAA")
        songs.add("BBB")
        songs.add("CCC")
        songs.add("DDD")
        songs.add("EEE")

        songList.adapter = MyAdapter(songs)  // requesting data from adapter
        songList.layoutManager = LinearLayoutManager(this) // putting data in LinearLayout

    }
}