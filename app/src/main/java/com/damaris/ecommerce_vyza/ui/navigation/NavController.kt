package com.damaris.ecommerce_vyza.ui.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.damaris.ecommerce_vyza.ui.modelview.AuthViewModel
import com.damaris.ecommerce_vyza.ui.screens.auth.LoginScreen
import com.damaris.ecommerce_vyza.ui.screens.auth.RegisterScreen

@Composable
fun NavController(
    navController: NavHostController = rememberNavController()
) {
    val viewModel: AuthViewModel = viewModel()
    NavHost(
        navController = navController,
        startDestination = Screens.Login.name
    ) {
        composable(
            route = Screens.Login.name
        ) {
            LoginScreen(
                registerClick = {
                    navController.navigate(Screens.Register.name) {
                        popUpTo(Screens.Login.name) {
                            inclusive = true
                            saveState = true
                        }

                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }

        composable(
            route = Screens.Register.name
        ) {
            RegisterScreen(
                loginClick = {
                    navController.navigate(Screens.Login.name) {
                        popUpTo(Screens.Register.name) {
                            inclusive = true
                            saveState = true
                        }

                        launchSingleTop = true
                        restoreState = true
                    }
                },
                viewModel = viewModel
            )
        }
    }
}