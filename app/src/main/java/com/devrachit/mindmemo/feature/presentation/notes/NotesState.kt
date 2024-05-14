package com.devrachit.mindmemo.feature.presentation.notes

import com.devrachit.mindmemo.feature.domain.model.Note
import com.devrachit.mindmemo.feature.domain.util.NoteOrder
import com.devrachit.mindmemo.feature.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)