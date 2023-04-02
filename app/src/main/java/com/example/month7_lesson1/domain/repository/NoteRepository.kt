package com.example.month7_lesson1.domain.repository

import com.example.month7_lesson1.domain.model.NOte

interface NoteRepository {
    fun createNote(nOte: NOte)
    fun getAllNotes():List<NOte>
    fun editNote(nOte: NOte)
    fun deleteNote(nOte: NOte)

}