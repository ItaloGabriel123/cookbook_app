package com.example.receitasonline.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color
import coil.compose.AsyncImage
import com.example.receitasonline.R


@Composable
fun FavoritesScreen() {

    LazyColumn(

        modifier =
            Modifier.fillMaxSize()

    ) {

        item {

            Text(

                "Favoritos",

                fontSize =
                    34.sp,

                fontWeight =
                    FontWeight.Bold,

                modifier =
                    Modifier.padding(20.dp)

            )

            Text(

                "Receitas salvas",

                modifier =
                    Modifier.padding(
                        start = 20.dp
                    ),

                color =
                    Color.Gray

            )
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
                    16.dp
                ),

        shape =
            RoundedCornerShape(
                20.dp
            )

    ){

        Row(

            modifier =
                Modifier.padding(
                    16.dp
                )

        ){

            AsyncImage(
                model = imagem,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(90.dp)
                    .clip(RoundedCornerShape(16.dp))
            )

            Spacer(
                Modifier.width(
                    12.dp
                )
            )

            Column {

                Text(

                    titulo,

                    fontWeight =
                        FontWeight.Bold,

                    fontSize =
                        20.sp

                )

                Spacer(
                    Modifier.height(
                        8.dp
                    )
                )

                Text(
                    tempo
                )

            }

        }

    }

}