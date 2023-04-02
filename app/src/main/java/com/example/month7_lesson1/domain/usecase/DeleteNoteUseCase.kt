package com.example.month7_lesson1.domain.usecase

import com.example.month7_lesson1.domain.model.NOte
import com.example.month7_lesson1.domain.repository.NoteRepository

class DeleteNoteUseCase(private val noteRepository: NoteRepository) {
    fun deleteNOte(nOte: NOte)=noteRepository.deleteNote(nOte)
}