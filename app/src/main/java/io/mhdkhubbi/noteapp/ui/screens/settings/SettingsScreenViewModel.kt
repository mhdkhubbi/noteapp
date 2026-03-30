package io.mhdkhubbi.noteapp.ui.screens.settings

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class SettingsScreenViewModel(
    private val userPreferencesManager: UserPreferencesManager
) : ViewModel(){
    private val _firstName = MutableStateFlow("")
    val firstName: StateFlow<String> = _firstName.asStateFlow()

    private val _lastName = MutableStateFlow("")
    val lastName: StateFlow<String> = _lastName.asStateFlow()

    private val _isSwitchOn = MutableStateFlow(false)
    val isSwitchOn: StateFlow<Boolean> = _isSwitchOn.asStateFlow()

  //  private val _isLoading = MutableStateFlow(true)
  //  val isLoading: StateFlow<Boolean> = _isLoading.asStateFlow()

    init {
        loadPreferences()
    }

    private fun loadPreferences() {
        viewModelScope.launch {
            userPreferencesManager.userPreferencesFlow.collect { preferences ->
                _firstName.value = preferences.firstName
                _lastName.value = preferences.lastName
                _isSwitchOn.value = preferences.isSwitchOn
              //  _isLoading.value = false
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

    fun updateNotificationPreference(isEnabled: Boolean) {
        _isSwitchOn.value = isEnabled
        viewModelScope.launch {
            userPreferencesManager.saveNotificationPreference(isEnabled)
        }
    }

    fun saveAllSettings(firstName: String, lastName: String, isNotificationsEnabled: Boolean) {
        viewModelScope.launch {
            userPreferencesManager.saveAllPreferences(firstName, lastName, isNotificationsEnabled)
        }
    }

    fun clearAllSettings() {
        viewModelScope.launch {
            userPreferencesManager.clearPreferences()
            _firstName.value = ""
            _lastName.value = ""
            _isSwitchOn.value = false
        }
    }



}