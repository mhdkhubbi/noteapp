package io.mhdkhubbi.noteapp.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [(Note::class)], version = 1, exportSchema = false)
abstract class NoteRoomDataBase : RoomDatabase() {

    abstract fun noteDao(): NoteDao

    companion object {
        private var INSTANCE: NoteRoomDataBase? = null

        fun getInstance(context: Context): NoteRoomDataBase {
            synchronized(this) {
                var instance = INSTANCE
                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        NoteRoomDataBase::class.java,
                        "product_database"

                    ).fallbackToDestructiveMigration()
                        .build()

                    INSTANCE = instance

                }
                return instance

            }

        }

    }


}