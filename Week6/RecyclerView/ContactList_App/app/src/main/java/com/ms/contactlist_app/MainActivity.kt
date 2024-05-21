package com.ms.contactlist_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.ms.contactlist_app.Adapter.contactListAdapter
import com.ms.contactlist_app.Data_Class.contactDetails
import com.ms.contactlist_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    var listCategories = ArrayList<contactDetails>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        listCategories = ArrayList()
        for (i in 0..20) {
            listCategories.add(contactDetails("Raunak Kr", "8809197034"))
        }

        binding.tvRecycler.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.tvRecycler.adapter = contactListAdapter(listCategories)
    }
}


