package com.ms.contactlist_app.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ms.contactlist_app.Data_Class.contactDetails
import com.ms.contactlist_app.R

class contactListAdapter(private val contactDetails: ArrayList<contactDetails>) :
    RecyclerView.Adapter<contactListAdapter.contactDetailsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): contactDetailsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.contact_list, parent, false)
        return contactDetailsViewHolder(view)
    }

    override fun getItemCount(): Int {
        return contactDetails.size
    }

    override fun onBindViewHolder(holder: contactDetailsViewHolder, position: Int) {
        holder.personName.text = contactDetails[position].personName
        holder.personNumber.text = contactDetails[position].personNumber
    }

    class contactDetailsViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
          val personName : TextView = itemView.findViewById(R.id.contactTitle)
          val personNumber : TextView = itemView.findViewById(R.id.contactNum)
    }
}


