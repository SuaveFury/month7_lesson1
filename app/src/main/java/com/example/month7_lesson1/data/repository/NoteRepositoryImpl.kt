package com.example.month7_lesson1.data.repository

import com.example.month7_lesson1.data.mapper.toEntity
import com.example.month7_lesson1.data.mapper.toNOte
import com.example.month7_lesson1.data.model.NoteDao
import com.example.month7_lesson1.domain.model.NOte
import com.example.month7_lesson1.domain.repository.NoteRepository

class NoteRepositoryImpl(
    private val noteDAo: NoteDao
):NoteRepository {
    override fun createNote(note: NOte) {
        noteDAo.createNote(note.toEntity())
    }

    override fun getAllNotes(): List<NOte> {
        return noteDAo.getAllNotes().map {
            it.toNOte()
        }
    }

    override fun editNote(note: NOte) {
        noteDAo.editNotes(note.toEntity())
    }

    override fun deleteNote(note: NOte) {
        noteDAo.deleteNOte(note.toEntity())
    }
}