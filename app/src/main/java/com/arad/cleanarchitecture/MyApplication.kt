package com.arad.cleanarchitecture

import android.app.Application
import com.arad.cleanarchitecture.storage.SharedPreferencesStorage
import com.arad.cleanarchitecture.user.UserManager

open class MyApplication: Application() {
    open val userManager by lazy {
        UserManager(SharedPreferencesStorage(this))
    }
}