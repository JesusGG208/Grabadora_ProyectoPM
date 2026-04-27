package com.example.grabadora.interfaces

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

object Routes{
    const val HOME = "home"
    const val AUDIO = "audio"
}

@Composable
fun AppNav(navController: NavHostController) {
    NavHost(navController = navController, startDestination = com.example.grabadora.interfaces.Routes.HOME) {
        composable(com.example.grabadora.interfaces.Routes.HOME) { HomeScreen(navController) }
        composable(com.example.grabadora.interfaces.Routes.AUDIO) { AudioScreen(navController) }
    }
}