package com.example.month7_lesson1.domain.usecase

import com.example.month7_lesson1.domain.repository.NoteRepository

class GetAllNotesUseCase(private val noteRepository: NoteRepository) {
    fun getaAllNotes()=noteRepository.getAllNotes()
}