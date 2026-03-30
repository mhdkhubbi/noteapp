package io.mhdkhubbi.noteapp.database

import androidx.lifecycle.MutableLiveData
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

class NoteRepository(private val noteDao: NoteDao) {


    val searchResults = MutableLiveData<List<Note>>()
    val allNote=noteDao.getAllNotes()
    val scope = CoroutineScope(Dispatchers.Main)

    fun insertNote(newNote: Note) {
        scope.launch(Dispatchers.IO) {
            noteDao.insertNote(newNote)
        }
    }

    fun deleteNote(name: String) {
        scope.launch(Dispatchers.IO) {
            noteDao.deleteNote(name)
        }
    }

    fun findNote(name: String) {
        scope.launch(Dispatchers.Main) {
            searchResults.value= asyncFind(name).await()
        }
    }

    private fun asyncFind(name: String): Deferred<List<Note>?> =
        scope.async(Dispatchers.IO) {
            return@async noteDao.findNote(name)

        }

}