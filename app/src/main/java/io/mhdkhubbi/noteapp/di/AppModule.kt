package io.mhdkhubbi.noteapp.di

import io.mhdkhubbi.noteapp.database.NoteRepository
import io.mhdkhubbi.noteapp.database.NoteRoomDataBase
import io.mhdkhubbi.noteapp.database.SavingDataViewModel
import io.mhdkhubbi.noteapp.ui.screens.settings.SettingsScreenViewModel
import io.mhdkhubbi.noteapp.ui.screens.settings.UserPreferencesManager
import org.koin.android.ext.koin.androidContext
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    single<NoteRoomDataBase> { NoteRoomDataBase.getInstance(androidContext()) }
    single { get<NoteRoomDataBase>().noteDao() }
    single<NoteRepository> { NoteRepository(get()) }
    single<UserPreferencesManager> { UserPreferencesManager(androidContext()) }
    viewModel<SettingsScreenViewModel> { SettingsScreenViewModel(get()) }
    viewModel<SavingDataViewModel> { SavingDataViewModel(get()) }
}