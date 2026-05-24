package com.example.receitasonline.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.receitasonline.R

@Composable
fun FavoritesScreen() {
    LazyColumn(
        modifier =
            Modifier.fillMaxSize()
    ){

        item {
            Column(
                modifier =
                    Modifier
                        .fillMaxWidth()
                        .background(
                            Color(0xFFFF7A18)
                        )
                        .padding(24.dp)
            ){

                Text(
                    "❤️ Favoritos",
                    color =
                        Color.White,
                    fontSize =
                        34.sp,
                    fontWeight =
                        FontWeight.Bold
                )

                Spacer(
                    Modifier.height(8.dp)
                )

                Text(
                    "Suas receitas salvas\npara cozinhar depois",
                    color =
                        Color.White.copy(
                            alpha = 0.9f
                        ),
                    fontSize =
                        16.sp
                )
            }
        }

        item {
            FavoriteCard(
                "Macarrão Cremoso",
                "30 min",
                R.drawable.macarrao
            )
        }

        item {
            FavoriteCard(
                "Receita Vegana",
                "20 min",
                R.drawable.vegano
            )
        }

        item {
            Column(
                modifier =
                    Modifier.padding(
                        start = 20.dp,
                        end = 20.dp,
                        top = 34.dp,
                        bottom = 8.dp
                    )
            ){

                Text(
                    "Últimos favoritos",
                    fontSize =
                        20.sp,
                    fontWeight =
                        FontWeight.SemiBold
                )

                Spacer(
                    Modifier.height(4.dp)
                )

                Text(
                    "Adicionados recentemente",
                    color =
                        Color.Gray,
                    fontSize =
                        13.sp
                )
            }
        }

        item {
            FavoriteCard(
                "Sobremesa Especial",
                "15 min",
                R.drawable.macarrao
            )
        }

        item {
            Spacer(
                modifier =
                    Modifier.height(
                        140.dp
                    )
            )
        }
    }
}

@Composable
fun FavoriteCard(
    titulo:String,
    tempo:String,
    imagem:Int
){

    Card(
        modifier =
            Modifier
                .fillMaxWidth()
                .padding(
                    horizontal = 20.dp,
                    vertical = 10.dp
                ),

        shape =
            RoundedCornerShape(
                28.dp
            )
    ){

        Box(
            modifier =
                Modifier.height(
                    260.dp
                )
        ){

            AsyncImage(
                model =
                    imagem,
                contentDescription =
                    null,
                modifier =
                    Modifier.fillMaxSize(),
                contentScale =
                    ContentScale.Crop
            )

            Box(
                modifier =
                    Modifier
                        .fillMaxSize()
                        .background(
                            Color.Black.copy(
                                alpha = 0.35f
                            )
                        )
            )

            Card(
                modifier =
                    Modifier
                        .align(
                            Alignment.TopEnd
                        )
                        .padding(
                            16.dp
                        ),

                shape =
                    RoundedCornerShape(
                        50.dp
                    ),

                colors =
                    CardDefaults.cardColors(

                        containerColor =
                            Color.White
                    )
            ){

                Text(
                    "❤️",
                    modifier =
                        Modifier.padding(
                            10.dp
                        )
                )
            }

            Column(
                modifier =
                    Modifier
                        .align(
                            Alignment.BottomStart
                        )
                        .padding(
                            22.dp
                        )
            ){

                Text(
                    titulo,
                    color =
                        Color.White,
                    fontWeight =
                        FontWeight.Bold,
                    fontSize =
                        30.sp
                )

                Spacer(
                    Modifier.height(
                        8.dp
                    )
                )

                Text(
                    "⏱ $tempo",
                    color =
                        Color.White.copy(
                            alpha = 0.9f
                        ),

                    fontSize =
                        16.sp
                )

                Spacer(
                    Modifier.height(
                        18.dp
                    )
                )

                Button(
                    onClick = {},
                    modifier =
                        Modifier.fillMaxWidth(),
                    shape =
                        RoundedCornerShape(
                            50.dp
                        )
                ){

                    Text(
                        "Ver Receita"
                    )
                }
            }
        }
    }
}