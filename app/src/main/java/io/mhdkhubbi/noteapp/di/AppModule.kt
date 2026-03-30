package io.mhdkhubbi.noteapp.di

import io.mhdkhubbi.noteapp.ui.screens.settings.SettingsScreenViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val appModule = module {


    viewModelOf(::SettingsScreenViewModel)
}