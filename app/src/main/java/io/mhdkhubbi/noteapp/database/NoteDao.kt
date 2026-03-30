package io.mhdkhubbi.noteapp.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface NoteDao {

    @Insert
    fun insertNote(note: Note)

    @Query("select * from notes where noteTitle=:name")
    fun findNote(name: String): List<Note>

    @Query("delete from notes where noteTitle=:name")
    fun deleteNote(name: String)

    @Query("select * from notes")
    fun getAllNotes(): LiveData<List<Note>>


}