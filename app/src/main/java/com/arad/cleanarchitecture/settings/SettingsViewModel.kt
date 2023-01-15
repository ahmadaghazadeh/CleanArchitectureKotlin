package com.arad.cleanarchitecture.settings

import com.arad.cleanarchitecture.user.UserManager

class SettingsViewModel(
    private val userManager: UserManager
) {

    fun logout() {
        userManager.logout()
    }
}
