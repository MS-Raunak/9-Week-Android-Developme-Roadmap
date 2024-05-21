package com.ms.androidarchitecture.View

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ms.androidarchitecture.Model.Word
import com.ms.androidarchitecture.R

class WordListAdapter(val mContext: Context) : RecyclerView.Adapter<WordListAdapter.WordViewHolder>() {
    private lateinit var mWords: List<Word>
    fun getWords() = mWords
    fun setWords(words: List<Word>){
        mWords = words
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordViewHolder {
        return WordViewHolder(LayoutInflater.from(mContext).inflate(R.layout.list_item, parent, false))
    }

    override fun getItemCount(): Int {
        return mWords.size
    }

    override fun onBindViewHolder(holder: WordViewHolder, position: Int) {
        var currentWords = mWords[position]
        holder.wordTextView.text = currentWords.name
        holder.wordTextView.text = currentWords.meaning
    }

    class WordViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        //we need a textview to display the words
        val wordTextView : TextView = itemView.findViewById(R.id.textView)
    }

}
