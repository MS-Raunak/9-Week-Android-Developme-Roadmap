package com.ms.androidarchitecture.Model

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Word::class], version = 1)
abstract class WordRoomDatabse : RoomDatabase() {
    abstract fun wordDao() : WordDao

    companion object{
        @Volatile
        var database : WordRoomDatabse? = null

        fun getInstance(context: Context) : WordRoomDatabse?{
            if(database == null) {
                synchronized(WordRoomDatabse :: class.java){
                    if (database == null){
                        database = Room.databaseBuilder(context.applicationContext, WordRoomDatabse :: class.java, "word_database").build()
                    }
                }
            }
            return database
        }

    }
}