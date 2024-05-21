package com.ms.sectionrecyclerview.Adapter


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.ms.sectionrecyclerview.Data_Class.Songs
import com.ms.sectionrecyclerview.R

// Adapter
class myAadapter(val songs : List<Songs>) : RecyclerView.Adapter<myAadapter.myViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_view, parent, false)
        return myViewHolder(view)
    }

    override fun getItemCount(): Int {
        return songs.size
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        holder.txtTitle.text = songs[position].title
        holder.txtDescription1.text = songs[position].description1
        holder.txtDescription2.text = songs[position].description2
        holder.txtDescription3.text = songs[position].description3
        holder.txtDescription4.text = songs[position].description4


    }

    // ViewHolder

    class myViewHolder(itemView: View) : ViewHolder(itemView){

        val txtTitle = itemView.findViewById<TextView>(R.id.txtTitle)
        val txtDescription1 = itemView.findViewById<TextView>(R.id.txtDescription1)
        val txtDescription2 = itemView.findViewById<TextView>(R.id.txtDescription2)
        val txtDescription3 = itemView.findViewById<TextView>(R.id.txtDescription3)
        val txtDescription4 = itemView.findViewById<TextView>(R.id.txtDescription4)
        val container = itemView.findViewById<LinearLayout>(R.id.container)

    }
}

