package com.devrachit.mindmemo.feature.domain.use_case

import com.devrachit.mindmemo.feature.domain.model.Note
import com.devrachit.mindmemo.feature.domain.repository.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}