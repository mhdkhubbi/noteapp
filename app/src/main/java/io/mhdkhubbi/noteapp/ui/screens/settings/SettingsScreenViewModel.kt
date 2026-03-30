package io.mhdkhubbi.noteapp.ui.screens.settings

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class SettingsScreenViewModel(
    private val userPreferencesManager: UserPreferencesManager
) : ViewModel() {
    private val _firstName = MutableStateFlow("")
    val firstName: StateFlow<String> = _firstName.asStateFlow()

    private val _lastName = MutableStateFlow("")
    val lastName: StateFlow<String> = _lastName.asStateFlow()

    private val _isSwitchOn = MutableStateFlow(false)
    val isSwitchOn: StateFlow<Boolean> = _isSwitchOn.asStateFlow()



    init {
        loadPreferences()
    }

    private fun loadPreferences() {
        viewModelScope.launch {
            userPreferencesManager.userPreferencesFlow.collect { preferences ->
                _firstName.value = preferences.firstName
                _lastName.value = preferences.lastName
                _isSwitchOn.value = preferences.isSwitchOn
            }
        }
    }

    fun updateFirstName(newFirstName: String) {
        _firstName.value = newFirstName
        viewModelScope.launch {
            userPreferencesManager.saveFirstName(newFirstName)
        }
    }

    fun updateLastName(newLastName: String) {
        _lastName.value = newLastName
        viewModelScope.launch {
            userPreferencesManager.saveLastName(newLastName)
        }
    }

    fun updateThemeModePreference(isEnabled: Boolean) {
        _isSwitchOn.value = isEnabled
        viewModelScope.launch {
            userPreferencesManager.saveThemeModePreference(isEnabled)
        }
    }

    fun saveAllSettings(firstName: String, lastName: String) {
        viewModelScope.launch {
            userPreferencesManager.saveAllPreferences(firstName, lastName)
        }
    }




}