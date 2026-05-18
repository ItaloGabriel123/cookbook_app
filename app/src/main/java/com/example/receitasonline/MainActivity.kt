package com.example.receitasonline

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.receitasonline.navigation.AppNavigation
import com.example.receitasonline.theme.ReceitasTheme

class MainActivity:ComponentActivity(){

    override fun onCreate(
        savedInstanceState: Bundle?
    ){

        super.onCreate(
            savedInstanceState
        )

        setContent {

           ReceitasTheme {

                AppNavigation()

            }

        }

    }

}