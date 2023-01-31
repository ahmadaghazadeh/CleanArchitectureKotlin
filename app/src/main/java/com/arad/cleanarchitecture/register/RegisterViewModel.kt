package com.arad.cleanarchitecture.register

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class RegisterViewModel:ViewModel() {
    var userName by mutableStateOf("")
        private set

    fun submit(){
        print("Click The Submit Button ${userName}")
    }
}
