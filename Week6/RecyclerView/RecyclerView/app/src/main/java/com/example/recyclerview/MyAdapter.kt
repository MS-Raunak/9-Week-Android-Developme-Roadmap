package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val songs: List<String>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item, parent, false)
        return MyViewHolder(view)
    }

    // return the size of view
    override fun getItemCount(): Int {
        return songs.size
    }

    // bind the data with adapter
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.txtView1.text = songs[position]
    }

    // nested class
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var txtView1 = itemView.findViewById<TextView>(R.id.textView1)
    }

}

