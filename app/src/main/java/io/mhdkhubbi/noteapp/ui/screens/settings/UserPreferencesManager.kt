package io.mhdkhubbi.noteapp.ui.screens.settings


import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "user_preferences")

class UserPreferencesManager(private val context: Context) {

    companion object {
        // Define keys
        val FIRST_NAME_KEY = stringPreferencesKey("first_name")
        val LAST_NAME_KEY = stringPreferencesKey("last_name")
        val IS_NOTIFICATIONS_ENABLED_KEY = booleanPreferencesKey("is_notifications_enabled")
    }

    // Flow to observe preferences
    val userPreferencesFlow: Flow<UserPreferences> = context.dataStore.data
        .map { preferences ->
            UserPreferences(
                firstName = preferences[FIRST_NAME_KEY] ?: "",
                lastName = preferences[LAST_NAME_KEY] ?: "",
                isSwitchOn = preferences[IS_NOTIFICATIONS_ENABLED_KEY] ?: false
            )
        }

    // Save first name
    suspend fun saveFirstName(firstName: String) {
        context.dataStore.edit { preferences ->
            preferences[FIRST_NAME_KEY] = firstName
        }
    }

    // Save last name
    suspend fun saveLastName(lastName: String) {
        context.dataStore.edit { preferences ->
            preferences[LAST_NAME_KEY] = lastName
        }
    }


    suspend fun saveThemeModePreference(isEnabled: Boolean) {
        context.dataStore.edit { preferences ->
            preferences[IS_NOTIFICATIONS_ENABLED_KEY] = isEnabled
        }
    }

    // Save all preferences at once
    suspend fun saveAllPreferences(firstName: String, lastName: String) {
        context.dataStore.edit { preferences ->
            preferences[FIRST_NAME_KEY] = firstName
            preferences[LAST_NAME_KEY] = lastName
        }
    }

    // Clear all preferences
    suspend fun clearPreferences() {
        context.dataStore.edit { preferences ->
            preferences.clear()
        }
    }
}

// Data class for user preferences
data class UserPreferences(
    val firstName: String = "",
    val lastName: String = "",
    val isSwitchOn: Boolean = false
)