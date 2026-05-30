package com.example.receitasonline.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.receitasonline.R
import androidx.navigation.NavController

@Composable
fun RecipeDetailScreen(

    nav: NavController,

    titulo:String,
    tempo:String,
    descricao:String,
    imagem:Int,
    ingredientes:List<String>,
    preparo:List<String>

){

    LazyColumn(

        modifier =
            Modifier.fillMaxSize()

    ){
        item {

            TextButton(

                onClick = {

                    nav.popBackStack()

                },

                modifier =
                    Modifier.padding(
                        start = 8.dp,
                        top = 8.dp
                    )
            ){

                Text("← Voltar")

            }

        }

        item {

            AsyncImage(

                model =
                    imagem,

                contentDescription =
                    null,

                modifier =
                    Modifier
                        .fillMaxWidth()
                        .height(260.dp),

                contentScale =
                    ContentScale.Crop

            )

        }

        item {
            Column(
                modifier =
                    Modifier.padding(20.dp)
            ){

                Text(
                    titulo,
                    fontSize =
                        32.sp,
                    fontWeight =
                        FontWeight.Bold

                )

                Spacer(
                    Modifier.height(8.dp)
                )

                Text(
                    "⭐ 4.9 • $tempo • Fácil",
                    fontSize =
                        16.sp
                )

                Spacer(
                    Modifier.height(12.dp)
                )

                Text(
                    descricao
                )

                Spacer(
                    Modifier.height(24.dp)
                )

                Button(
                    onClick = {},
                    modifier =
                        Modifier.fillMaxWidth(),
                    shape =
                        RoundedCornerShape(50.dp)
                ){

                    Text("❤️ Favoritar")
                }

                Spacer(
                    Modifier.height(30.dp)
                )

                Text(

                    "Ingredientes",
                    fontSize =
                        24.sp,
                    fontWeight =
                        FontWeight.Bold
                )

                Spacer(
                    Modifier.height(12.dp)
                )

                ingredientes.forEach {

                    Text("• $it")

                }

                Spacer(
                    Modifier.height(30.dp)
                )

                Text(

                    "Modo de Preparo",

                    fontSize =
                        24.sp,

                    fontWeight =
                        FontWeight.Bold

                )

                Spacer(
                    Modifier.height(12.dp)
                )

                preparo.forEachIndexed { index, passo ->

                    Text("${index + 1}. $passo")

                }

                Spacer(
                    Modifier.height(140.dp)
                )

            }

        }

    }

}