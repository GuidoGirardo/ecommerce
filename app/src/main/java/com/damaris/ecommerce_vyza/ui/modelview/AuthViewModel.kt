package com.damaris.ecommerce_vyza.ui.modelview

import androidx.lifecycle.ViewModel
import com.damaris.ecommerce_vyza.data.auth.RegisterAuth

class AuthViewModel: ViewModel(){
    fun registerUser(email: String, password: String) {
        RegisterAuth(email, password)
    }
}