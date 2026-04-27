package com.example.grabadora

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Surface
import androidx.navigation.compose.rememberNavController
import com.example.grabadora.interfaces.AppNav
import com.example.grabadora.ui.theme.GrabadoraTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GrabadoraTheme {
                Surface {
                    val navController = rememberNavController()
                    AppNav(navController)
                }
            }
        }
    }
}