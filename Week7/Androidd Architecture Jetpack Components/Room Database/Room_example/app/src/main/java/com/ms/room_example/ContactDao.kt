package com.ms.room_example

import androidx.lifecycle.LiveData
import androidx.room.*


@Dao
interface ContactDao {

    @Insert
    suspend fun insertContactData(contact: Contact)

    @Update
    suspend fun updateContactData(contact: Contact)

    @Delete
    suspend fun deleteContactData(contact: Contact)

    @Query("SELECT * FROM contact")
    fun getContactData() : LiveData<List<Contact>>

}