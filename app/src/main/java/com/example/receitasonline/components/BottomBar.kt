package com.example.receitasonline.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun BottomBar(

    nav: NavController

){

    Box(
        modifier =
            Modifier
                .fillMaxWidth()
                .padding(
                    bottom = 70.dp,
                    start = 22.dp,
                    end = 22.dp
                ),

        contentAlignment =
            Alignment.Center
    ){

        Card(
            shape =
                RoundedCornerShape(
                    34.dp
                ),

            elevation =
                CardDefaults.cardElevation(
                    10.dp
                ),

            colors =
                CardDefaults.cardColors(

                    containerColor =
                        Color.White
                )
        ){

            Row(
                modifier =
                    Modifier
                        .fillMaxWidth()
                        .padding(
                            vertical = 18.dp,
                            horizontal = 8.dp
                        ),

                horizontalArrangement =
                    Arrangement.SpaceEvenly
            ){

                Item(
                    "🏠",
                    "Home"
                ){
                    nav.navigate("home")
                }

                Item(
                    "❤️",
                    "Favoritos"
                ){
                    nav.navigate("favoritos")
                }

                Item(
                    "➕",
                    "Adicionar"
                ){
                    nav.navigate("add")
                }

                Item(
                    "👤",
                    "Perfil"
                ){
                    nav.navigate("login")
                }
            }
        }
    }
}

@Composable
fun Item(
    emoji:String,
    texto:String,
    clique:()->Unit
){

    Column(
        horizontalAlignment =
            Alignment.CenterHorizontally,
        modifier =
            Modifier.clickable {

                clique()
            }
    ){

        Text(
            text =
                emoji,
            fontSize =
                24.sp

        )

        Spacer(
            Modifier.height(4.dp)
        )

        Text(
            text =
                texto,
            fontSize =
                11.sp,
            fontWeight =
                FontWeight.Medium
        )
    }
}