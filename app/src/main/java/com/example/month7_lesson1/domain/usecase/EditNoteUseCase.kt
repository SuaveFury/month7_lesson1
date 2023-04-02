package com.example.month7_lesson1.domain.usecase

import com.example.month7_lesson1.domain.model.NOte
import com.example.month7_lesson1.domain.repository.NoteRepository

class EditNoteUseCase(private val noteRepository: NoteRepository) {
    fun editNOte(note: NOte)=noteRepository.editNote(note)
}