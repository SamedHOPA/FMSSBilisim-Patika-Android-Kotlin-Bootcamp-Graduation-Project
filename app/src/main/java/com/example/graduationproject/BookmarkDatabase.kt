package com.example.graduationproject

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.graduationproject.ui.detail.DetailFragment
import com.example.graduationproject.ui.trip.tablayout.bookmark.TabBookmarkFragment

@Database(entities = [BookmarkModel::class], version = 1)
abstract class BookmarkDatabase : RoomDatabase() {

    abstract fun bookmarkDao(): BookmarkDAO

    companion object {
        private var instance: BookmarkDatabase? = null

        fun getBookmarkDatabase(context: Context): BookmarkDatabase? {
            if (instance == null) {
                instance = Room.databaseBuilder(
                    context,
                    BookmarkDatabase::class.java,
                    "bookmark.db"
                ).allowMainThreadQueries()
                    .build()
            }
            return instance
        }
    }
}