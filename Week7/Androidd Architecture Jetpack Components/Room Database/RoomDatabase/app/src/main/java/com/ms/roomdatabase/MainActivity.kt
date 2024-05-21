package com.ms.roomdatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {

    lateinit var databse: ContactDatabse

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // instance of ContactDatabase
        databse = Room.databaseBuilder(applicationContext, ContactDatabse :: class.java, "contactDB").build()

        // using coroutine it will run on background thread
        GlobalScope.launch {
            databse.contactDao().insertContact(Contact(0, "Raunak", "8809197032"))
        }

    }
}