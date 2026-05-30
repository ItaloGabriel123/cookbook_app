package com.example.receitasonline.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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

    var dificuldade by remember {
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

                    "➕ Nova Receita",

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

                    "Compartilhe sua receita com a comunidade",

                    color =
                        Color.White.copy(alpha = 0.9f),

                    fontSize =
                        16.sp

                )

            }

        }

        item {

            Card(

                modifier =
                    Modifier
                        .fillMaxWidth()
                        .padding(20.dp),

                shape =
                    RoundedCornerShape(28.dp)

            ){

                Column(

                    modifier =
                        Modifier.padding(12.dp)

                ){

                    Card(

                        modifier =
                            Modifier
                                .fillMaxWidth()
                                .height(120.dp)
                                .padding(8.dp),

                        shape =
                            RoundedCornerShape(20.dp),

                        colors =
                            CardDefaults.cardColors(

                                containerColor =
                                    Color(0xFFF5F5F5)

                            )

                    ){

                        Column(

                            modifier =
                                Modifier.fillMaxSize(),

                            verticalArrangement =
                                Arrangement.Center,

                            horizontalAlignment =
                                Alignment.CenterHorizontally

                        ){

                            Text(
                                "📷",
                                fontSize = 32.sp
                            )

                            Spacer(
                                Modifier.height(8.dp)
                            )

                            Text(

                                "Adicionar foto",

                                fontWeight =
                                    FontWeight.Medium,

                                fontSize =
                                    14.sp

                            )

                            Text(

                                "Opcional",

                                color =
                                    Color.Gray,

                                fontSize =
                                    11.sp

                            )

                        }

                    }

                    Text(

                        "Preencha os campos abaixo",

                        color =
                            Color.Gray,

                        modifier =
                            Modifier.padding(

                                start = 20.dp,
                                top = 4.dp,
                                bottom = 8.dp

                            )

                    )

                    Spacer(
                        Modifier.height(12.dp)
                    )

                    Text(

                        "Informações da Receita",

                        fontWeight =
                            FontWeight.Bold,

                        fontSize =
                            20.sp,

                        modifier =
                            Modifier.padding(

                                start = 20.dp,
                                top = 8.dp,
                                bottom = 8.dp

                            )

                    )

                    CampoTexto(
                        "Título",
                        titulo
                    ){
                        titulo = it
                    }

                    CampoTexto(
                        "Descrição",
                        descricao
                    ){
                        descricao = it
                    }

                    OutlinedTextField(

                        value =
                            categoria,

                        onValueChange = {
                            categoria = it
                        },

                        label = {
                            Text("Categoria")
                        },

                        placeholder = {
                            Text("Ex: Sobremesa, Vegana, Airfryer...")
                        },

                        shape =
                            RoundedCornerShape(20.dp),

                        modifier =
                            Modifier
                                .fillMaxWidth()
                                .padding(
                                    horizontal = 20.dp,
                                    vertical = 8.dp
                                )

                    )

                    Text(

                        "Dificuldade",

                        fontWeight =
                            FontWeight.Bold,

                        fontSize =
                            18.sp,

                        modifier =
                            Modifier.padding(

                                start = 20.dp,
                                top = 16.dp,
                                bottom = 8.dp

                            )

                    )

                    Row(

                        modifier =
                            Modifier.padding(horizontal = 20.dp),

                        horizontalArrangement =
                            Arrangement.spacedBy(8.dp)

                    ){

                        FilterChip(

                            selected =
                                dificuldade == "Fácil",

                            onClick = {
                                dificuldade = "Fácil"
                            },

                            label = {
                                Text("Fácil")
                            }

                        )

                        FilterChip(

                            selected =
                                dificuldade == "Médio",

                            onClick = {
                                dificuldade = "Médio"
                            },

                            label = {
                                Text("Médio")
                            }

                        )

                        FilterChip(

                            selected =
                                dificuldade == "Difícil",

                            onClick = {
                                dificuldade = "Difícil"
                            },

                            label = {
                                Text("Difícil")
                            }

                        )

                    }

                    Spacer(
                        Modifier.height(12.dp)
                    )

                    Text(

                        "Ingredientes",

                        fontWeight =
                            FontWeight.Bold,

                        fontSize =
                            18.sp,

                        modifier =
                            Modifier.padding(

                                start = 20.dp,
                                top = 16.dp,
                                bottom = 8.dp

                            )

                    )

                    OutlinedTextField(

                        value =
                            ingredientes,

                        onValueChange = {

                            ingredientes = it

                        },

                        label = {

                            Text(
                                "Ingredientes"
                            )

                        },

                        modifier =
                            Modifier
                                .fillMaxWidth()
                                .height(120.dp)
                                .padding(
                                    horizontal = 20.dp,
                                    vertical = 8.dp
                                ),

                        shape =
                            RoundedCornerShape(20.dp)

                    )

                    Text(

                        "Modo de Preparo",

                        fontWeight =
                            FontWeight.Bold,

                        fontSize =
                            18.sp,

                        modifier =
                            Modifier.padding(

                                start = 20.dp,
                                top = 16.dp,
                                bottom = 8.dp

                            )

                    )

                    OutlinedTextField(

                        value =
                            preparo,

                        onValueChange = {

                            preparo = it

                        },

                        label = {

                            Text(
                                "Modo de preparo"
                            )

                        },

                        modifier =
                            Modifier
                                .fillMaxWidth()
                                .height(150.dp)
                                .padding(
                                    horizontal = 20.dp,
                                    vertical = 8.dp
                                ),

                        shape =
                            RoundedCornerShape(20.dp)

                    )

                }

            }

            Spacer(
                Modifier.height(20.dp)
            )

            Card(

                modifier =
                    Modifier
                        .fillMaxWidth()
                        .padding(20.dp),

                shape =
                    RoundedCornerShape(20.dp),

                colors =
                    CardDefaults.cardColors(

                        containerColor =
                            Color(0xFFFFF7F1)

                    )

            ){

                Column(

                    modifier =
                        Modifier.padding(20.dp)

                ){

                    Text(

                        "Prévia",

                        fontWeight =
                            FontWeight.Bold,

                        fontSize =
                            18.sp

                    )

                    Spacer(
                        Modifier.height(8.dp)
                    )

                    Text(

                        if(titulo.isBlank())
                            "Nome da Receita"
                        else
                            titulo,

                        fontWeight =
                            FontWeight.Bold,

                        fontSize =
                            22.sp

                    )

                    Spacer(
                        Modifier.height(8.dp)
                    )

                    Text(

                        if(descricao.isBlank())
                            "Adicione uma descrição para sua receita."
                        else
                            descricao,

                        color =
                            Color.Gray,

                        fontSize =
                            14.sp

                    )

                    Spacer(
                        Modifier.height(12.dp)
                    )

                    Row(

                        horizontalArrangement =
                            Arrangement.spacedBy(8.dp)

                    ){

                        Surface(

                            shape =
                                RoundedCornerShape(50.dp),

                            color =
                                Color(0xFFFFE0B2)

                        ){

                            Text(

                                if(categoria.isBlank())
                                    "Categoria"
                                else
                                    categoria,

                                modifier =
                                    Modifier.padding(

                                        horizontal = 12.dp,
                                        vertical = 6.dp

                                    )

                            )

                        }

                    }

                    if(dificuldade.isNotBlank()){

                        Spacer(
                            Modifier.height(8.dp)
                        )

                        Text(

                            "Dificuldade: $dificuldade",

                            color =
                                Color.Gray,

                            fontSize =
                                14.sp

                        )

                    }

                }

            }

            Button(

                onClick = {},

                modifier =
                    Modifier
                        .fillMaxWidth()
                        .padding(
                            horizontal = 20.dp
                        )
                        .height(58.dp),

                shape =
                    RoundedCornerShape(50.dp),

                colors =
                    ButtonDefaults.buttonColors(

                        containerColor =
                            Color(0xFFFF8A00)

                    )

            ){

                Text(

                    "Publicar Receita",

                    fontSize =
                        18.sp,

                    fontWeight =
                        FontWeight.Bold

                )

            }

            Spacer(
                Modifier.height(120.dp)
            )

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

        shape =
            RoundedCornerShape(20.dp),

        modifier =
            Modifier
                .fillMaxWidth()
                .padding(
                    horizontal = 20.dp,
                    vertical = 8.dp
                )

    )

}