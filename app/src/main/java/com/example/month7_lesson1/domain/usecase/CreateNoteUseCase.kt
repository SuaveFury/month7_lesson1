package com.example.month7_lesson1.domain.usecase

import com.example.month7_lesson1.domain.model.NOte
import com.example.month7_lesson1.domain.repository.NoteRepository

class CreateNoteUseCase(private val noteRepository: NoteRepository) {
    fun createNOte (nOte: NOte)=noteRepository.createNote(nOte)
}