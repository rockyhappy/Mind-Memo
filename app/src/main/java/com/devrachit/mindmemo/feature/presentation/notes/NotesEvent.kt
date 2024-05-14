package com.devrachit.mindmemo.feature.presentation.notes

import com.devrachit.mindmemo.feature.domain.model.Note
import com.devrachit.mindmemo.feature.domain.util.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}