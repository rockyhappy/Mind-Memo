package com.devrachit.mindmemo.feature.domain.use_case

import com.devrachit.mindmemo.feature.domain.model.Note
import com.devrachit.mindmemo.feature.domain.repository.NoteRepository

class GetNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}