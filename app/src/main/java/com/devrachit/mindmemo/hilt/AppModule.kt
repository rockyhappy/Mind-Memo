package com.devrachit.mindmemo.hilt

import android.app.Application
import androidx.room.Room
import com.devrachit.mindmemo.feature.data.data_source.NoteDatabase
import com.devrachit.mindmemo.feature.data.repository.NoteRepositoryImpl
import com.devrachit.mindmemo.feature.domain.repository.NoteRepository
import com.devrachit.mindmemo.feature.domain.use_case.AddNote
import com.devrachit.mindmemo.feature.domain.use_case.DeleteNote
import com.devrachit.mindmemo.feature.domain.use_case.GetNote
import com.devrachit.mindmemo.feature.domain.use_case.GetNotes
import com.devrachit.mindmemo.feature.domain.use_case.NoteUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideNoteDatabase(app: Application): NoteDatabase {
        return Room.databaseBuilder(
            app,
            NoteDatabase::class.java,
            NoteDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(db: NoteDatabase): NoteRepository {
        return NoteRepositoryImpl(db.noteDao)
    }

    @Provides
    @Singleton
    fun provideNoteUseCases(repository: NoteRepository): NoteUseCases {
        return NoteUseCases(
            getNotes = GetNotes(repository),
            deleteNote = DeleteNote(repository),
            addNote = AddNote(repository),
            getNote = GetNote(repository)
        )
    }
}