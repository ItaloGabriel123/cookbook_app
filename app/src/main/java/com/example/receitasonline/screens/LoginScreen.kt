package com.example.receitasonline.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginScreen(){

    var email by remember {
        mutableStateOf("")
    }

    var senha by remember {
        mutableStateOf("")
    }

    var tipoLogin by remember {
        mutableStateOf("usuario")
    }

    Column(
        modifier =
            Modifier.fillMaxSize()
    ){

        Box(
            modifier =
                Modifier
                    .fillMaxWidth()
                    .height(
                        260.dp
                    )
                    .background(
                        Brush.horizontalGradient(
                            listOf(
                                Color(
                                    0xFFFF7A18
                                ),

                                Color.Red
                            )
                        )
                    )
        ){

            Column(
                modifier =
                    Modifier.padding(
                        30.dp
                    )
            ){

                Text(
                    "Bem-vindo",
                    color =
                        Color.White,
                    fontSize =
                        42.sp,
                    fontWeight =
                        FontWeight.Bold
                )

                Text(

                    if(tipoLogin == "usuario")
                        "Entre para acessar\nsuas receitas"
                    else
                        "Área exclusiva para\nnutricionistas",

                    color =
                        Color.White

                )
            }
        }

        Card(
            modifier =
                Modifier
                    .fillMaxWidth()
                    .offset(
                        y = (-40).dp
                    )
                    .padding(
                        20.dp
                    ),
            shape =
                RoundedCornerShape(
                    28.dp
                )
        ){

            Column(
                modifier =
                    Modifier.padding(
                        24.dp
                    )
            ){

                Text(
                    "Login",
                    fontSize =
                        32.sp,
                    fontWeight =
                        FontWeight.Bold
                )

                Spacer(
                    Modifier.height(16.dp)
                )

                Row(

                    modifier =
                        Modifier.fillMaxWidth(),

                    horizontalArrangement =
                        Arrangement.spacedBy(8.dp)

                ){

                    FilterChip(

                        selected =
                            tipoLogin == "usuario",

                        onClick = {

                            tipoLogin = "usuario"

                        },

                        label = {

                            Text("👤 Usuário")

                        }

                    )

                    FilterChip(

                        selected =
                            tipoLogin == "nutricionista",

                        onClick = {

                            tipoLogin = "nutricionista"

                        },

                        label = {

                            Text("🩺 Nutricionista")

                        }

                    )

                }

                OutlinedTextField(
                    value =
                        email,
                    onValueChange = {
                        email = it
                    },

                    label = {
                        Text(
                            "Email"
                        )
                    },

                    modifier =
                        Modifier.fillMaxWidth(),
                    shape =
                        RoundedCornerShape(
                            18.dp
                        )
                )

                Spacer(
                    Modifier.height(
                        18.dp
                    )
                )

                OutlinedTextField(
                    value =
                        senha,
                    onValueChange = {
                        senha = it
                    },

                    label = {

                        Text(
                            "Senha"
                        )
                    },

                    modifier =
                        Modifier.fillMaxWidth(),
                    shape =
                        RoundedCornerShape(
                            18.dp
                        )
                )

                Spacer(
                    Modifier.height(
                        24.dp
                    )
                )

                Button(
                    onClick = {},
                    modifier =
                        Modifier.fillMaxWidth(),
                    shape =
                        RoundedCornerShape(
                            20.dp
                        )
                ){

                    Text(

                        if(tipoLogin == "usuario")
                            "Entrar"
                        else
                            "Entrar como Nutricionista"

                    )
                }

                TextButton(
                    onClick = {}
                ){

                    Text(
                        "Criar conta"
                    )
                }

                HorizontalDivider(

                    modifier =
                        Modifier.padding(
                            vertical = 16.dp
                        )

                )

                Card(

                    colors =
                        CardDefaults.cardColors(

                            containerColor =
                                Color(0xFFFFF7F1)

                        )

                ){

                    Column(

                        modifier =
                            Modifier.padding(16.dp)

                    ){

                        Text(

                            "🩺 Área Profissional",

                            fontWeight =
                                FontWeight.Bold

                        )

                        Spacer(
                            Modifier.height(6.dp)
                        )

                        Text(

                            "Nutricionistas podem acompanhar pacientes e compartilhar planos alimentares.",

                            fontSize =
                                13.sp,

                            color =
                                Color.Gray

                        )

                    }

                }
            }
        }
    }
}