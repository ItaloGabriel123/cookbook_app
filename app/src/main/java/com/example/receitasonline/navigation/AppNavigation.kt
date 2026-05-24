package com.example.receitasonline.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.*
import com.example.receitasonline.components.BottomBar
import com.example.receitasonline.screens.*

@Composable
fun AppNavigation(){
    val nav =
        rememberNavController()
    Scaffold(
        bottomBar = {
            BottomBar(nav)
        }
    ){ padding ->

        NavHost(
            navController =
                nav,
            startDestination =
                "home",
            modifier =
                Modifier.padding(
                    padding
                )
        ){

            composable("home"){
                HomeScreen()
            }

            composable("favoritos"){
                FavoritesScreen()
            }

            composable("login"){
                LoginScreen()
            }

            composable("add"){

                AddRecipeScreen()
            }
        }
    }
}