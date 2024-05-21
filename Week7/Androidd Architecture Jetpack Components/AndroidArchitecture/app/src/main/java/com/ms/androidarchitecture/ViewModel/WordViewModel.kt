package com.ms.androidarchitecture.ViewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.ms.androidarchitecture.Model.Word
import com.ms.androidarchitecture.Model.WordRepository

class WordViewModel(application: Application) : AndroidViewModel(application) {
    private val wordRepository : WordRepository
    private val allWords : LiveData<List<Word>>

    init {
        wordRepository = WordRepository(application)
        allWords = wordRepository.getAllWords()
    }

    fun insertWord(word:Word) {
        wordRepository.insertWord(word)
    }

    fun deleteWord(word:Word) {
        wordRepository.deleteWord(word)
    }

    fun deleteAllWords() {
        wordRepository.deleteAllWords()
    }

    fun getAllWords() = allWords

    fun getWordByName(name:String): Word? {
        return wordRepository.getWordByName(name)
    }
}