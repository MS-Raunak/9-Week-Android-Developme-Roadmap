package com.ms.androidarchitecture.Model

import androidx.lifecycle.LiveData
import androidx.room.*


// Dao : Data Access Object that is a part of application architecture
@Dao
interface WordDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE) // If databse has any exist data the it will be replace(Insert)with new data
    fun insertWord(word: Word)

    @Delete                     // Delete single the data from databse
    fun deleteWord(word: Word)

    @Query("DELETE FROM word_table")  // Used to fire query into databse: Here delete all data from database
    fun deleteAllWords()

    @Query("SELECT * FROM word_table ORDER by name ASC") // database sorting in ascending order
    fun getAllWords() : LiveData<List<Word>>

    @Query("SELECT * FROM word_table WHERE Name = :name") // show the data by name
    fun getWordByName(name : String) : Word
}
