package com.example.receitasonline.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
                    bottom = 50.dp,
                    start = 20.dp,
                    end = 20.dp
                ),

        contentAlignment =
            Alignment.Center

    ){

        Card(

            shape =
                RoundedCornerShape(
                    40.dp
                )

        ){

            Row(

                modifier =
                    Modifier
                        .fillMaxWidth()
                        .padding(
                            18.dp
                        ),

                horizontalArrangement =
                    Arrangement.SpaceEvenly

            ){

                Item("🏠"){
                    nav.navigate("home")
                }

                Item("❤️"){
                    nav.navigate("favoritos")
                }

                Item("➕"){
                    nav.navigate("add")
                }

                Item("👤"){
                    nav.navigate("login")
                }

            }

        }

    }

}



@Composable
fun Item(

    emoji:String,

    clique:()->Unit

){

    Text(

        text =
            emoji,

        fontSize =
            28.sp,

        modifier =
            Modifier.clickable {

                clique()

            }

    )

}