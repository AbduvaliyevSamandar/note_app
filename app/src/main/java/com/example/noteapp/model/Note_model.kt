package com.example.noteapp.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "contacts")
data class Note_model (
    @PrimaryKey(autoGenerate = true)
    val id:Long=0L,
    @ColumnInfo("name")
    var note_name:String,


    var note_text:String,
    var date_item:String)