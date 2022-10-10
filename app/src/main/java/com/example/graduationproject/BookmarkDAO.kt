package com.example.graduationproject

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface BookmarkDAO {
    @Insert
    fun insert(bookmark: BookmarkModel)

    @Delete
    fun delete(bookmark: BookmarkModel)

    @Query("SELECT*FROM bookmark")
    fun getAllBookmark(): List<BookmarkModel>
}