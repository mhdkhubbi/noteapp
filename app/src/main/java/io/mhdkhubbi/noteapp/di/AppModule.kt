package io.mhdkhubbi.noteapp.di

import io.mhdkhubbi.noteapp.database.NoteRepository
import io.mhdkhubbi.noteapp.ui.screens.settings.SettingsScreenViewModel
import io.mhdkhubbi.noteapp.ui.screens.settings.UserPreferencesManager
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val appModule = module {

    singleOf(::NoteRepository)
    singleOf(::UserPreferencesManager)
    viewModelOf(::SettingsScreenViewModel)
}