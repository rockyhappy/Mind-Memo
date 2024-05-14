package com.devrachit.mindmemo.feature.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.devrachit.mindmemo.ui.theme.BabyBlue
import com.devrachit.mindmemo.ui.theme.LightGreen
import com.devrachit.mindmemo.ui.theme.RedOrange
import com.devrachit.mindmemo.ui.theme.RedPink
import com.devrachit.mindmemo.ui.theme.Violet

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}

class InvalidNoteException(message: String): Exception(message)