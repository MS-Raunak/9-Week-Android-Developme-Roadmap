package com.ms.room_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.room.Room
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    lateinit var database: ContactDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val databaseInstance= Room.databaseBuilder(applicationContext, ContactDatabase :: class.java, "contactDB")
        database = databaseInstance.build()

        GlobalScope.launch {
            database.contactDao().insertContactData(Contact(0, "RRRR", "0000000"))
        }

    }

    fun getData(view: View) {
        database.contactDao().getContactData().observe(this){
            Log.d("Main", it.toString())
        }
    }
}