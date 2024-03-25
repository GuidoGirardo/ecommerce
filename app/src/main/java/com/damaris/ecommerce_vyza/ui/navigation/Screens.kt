package com.damaris.ecommerce_vyza.ui.navigation

import androidx.annotation.StringRes
import com.damaris.ecommerce_vyza.R

enum class Screens(
    @StringRes title: Int
) {
    Login(title = R.string.ls_login),
    Register(title = R.string.rs_register)
}