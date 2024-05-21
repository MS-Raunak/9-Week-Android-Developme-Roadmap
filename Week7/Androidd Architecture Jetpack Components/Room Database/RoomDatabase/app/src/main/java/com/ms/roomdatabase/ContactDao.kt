//package com.ms.roomdatabase
//
//import androidx.lifecycle.LiveData
//import androidx.room.*
//
//
//@Dao                         // simply perform curd operation(create, update, read , delete)
//interface ContactDao {       // Dao: data access object always be interface
//
//    @Insert
//    suspend fun insertContact(contact: Contact)  // data insertion
//
//    @Update
//    suspend fun updateContact(contact: Contact)  // data updation
//
//    @Delete
//    suspend fun deleteContact(contact: Contact) // data deletion
//
//    @Query("SELECT * FROM contact")
//    fun getContact() : LiveData<List<Contact>>  // data reading
//}
//
//
//
////  This file is my third file