package com.damaris.ecommerce_vyza.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.damaris.ecommerce_vyza.ui.screens.auth.LoginScreen
import com.damaris.ecommerce_vyza.ui.screens.auth.RegisterScreen

@Composable
fun NavController(
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = Screens.Login.name
    ) {
        composable(
            route = Screens.Login.name
        ) {
            LoginScreen()
        }

        composable(
            route = Screens.Register.name
        ) {
            RegisterScreen()
        }
    }
}