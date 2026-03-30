package io.mhdkhubbi.noteapp.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "notes")
data class Note(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "noteId")
    var id: Int = 0,
    @ColumnInfo(name = "noteTitle")
    var noteTitle: String,

    var noteText: String

    )