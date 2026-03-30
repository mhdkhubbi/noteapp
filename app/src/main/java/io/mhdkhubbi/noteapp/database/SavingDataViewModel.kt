package io.mhdkhubbi.noteapp.database

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SavingDataViewModel(application: Application) : ViewModel() {


    val allNotes: LiveData<List<Note>>
    private val repository: NoteRepository
    val searchResults: MutableLiveData<List<Note>>

    init {
        val NoteDb = NoteRoomDataBase.getInstance(application)
        val noteDao = NoteDb.noteDao()
        repository = NoteRepository(noteDao)
        allNotes = repository.allNote
        searchResults = repository.searchResults
    }

    fun insertNote(product: Note) {
        repository.insertNote(product)

    }

    fun findNote(name: String) {
        repository.findNote(name)

    }

    fun deleteNote(name: String) {
        repository.deleteNote(name)

    }


}