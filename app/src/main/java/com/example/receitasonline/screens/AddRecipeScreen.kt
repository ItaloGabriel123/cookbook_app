package com.example.receitasonline.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AddRecipeScreen() {
    var titulo by remember {
        mutableStateOf("")
    }

    var descricao by remember {
        mutableStateOf("")
    }

    var categoria by remember {
        mutableStateOf("")
    }

    var ingredientes by remember {
        mutableStateOf("")
    }

    var preparo by remember {
        mutableStateOf("")
    }

    LazyColumn(
        modifier =
            Modifier.fillMaxSize()
    ) {
        item {
            Text(
                "Adicionar Receita",
                fontSize =
                    34.sp,
                fontWeight =
                    FontWeight.Bold,
                modifier =
                    Modifier.padding(20.dp)
            )
        }

        item {
            CampoTexto(
                "Título",
                titulo
            ) {
                titulo = it
            }

            CampoTexto(
                "Descrição",
                descricao
            ) {
                descricao = it

            }

            CampoTexto(
                "Categoria",
                categoria
            ) {
                categoria = it

            }

            CampoTexto(
                "Ingredientes",
                ingredientes
            ) {
                ingredientes = it

            }

            CampoTexto(
                "Modo de preparo",
                preparo
            ) {
                preparo = it
            }


            Spacer(
                Modifier.height(
                    24.dp
                )
            )

            Button(
                onClick = {},
                modifier =
                    Modifier
                        .fillMaxWidth()
                        .padding(
                            20.dp
                        ),
                shape =
                    RoundedCornerShape(
                        20.dp
                    )
            ) {

                Text(
                    "Publicar Receita"
                )
            }
        }
    }
}

@Composable
fun CampoTexto(
    titulo:String,
    valor:String,
    onValor:(String)->Unit
){

    OutlinedTextField(
        value =
            valor,
        onValueChange =
            onValor,
        label = {
            Text(
                titulo
            )
        },

        modifier =
            Modifier
                .fillMaxWidth()
                .padding(
                    20.dp,
                    8.dp
                )
    )
}