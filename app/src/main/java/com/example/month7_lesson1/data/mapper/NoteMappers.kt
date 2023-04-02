package com.example.month7_lesson1.data.mapper

import com.example.month7_lesson1.data.model.NoteEntity
import com.example.month7_lesson1.domain.model.NOte

fun NOte.toEntity()=NoteEntity(
    id,title,desc
)
fun NoteEntity.toNOte()=NOte(
    id,title,desc
)