package com.example.receitasonline.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.receitasonline.data.UsuarioAtual

@Composable
fun RegisterScreen(
    nav: NavController
){

    var nome by remember {
        mutableStateOf("")
    }

    var email by remember {
        mutableStateOf("")
    }

    var senha by remember {
        mutableStateOf("")
    }

    var confirmarSenha by remember {
        mutableStateOf("")
    }

    var tipoConta by remember {
        mutableStateOf("usuario")
    }

    var crn by remember {
        mutableStateOf("")
    }

    var especialidade by remember {
        mutableStateOf("")
    }

    var erro by remember {
        mutableStateOf("")
    }

    LazyColumn(
        modifier =
            Modifier.fillMaxSize()
    ){

        item {

            Box(
                modifier =
                    Modifier
                        .fillMaxWidth()
                        .height(260.dp)
                        .background(
                            Brush.horizontalGradient(
                                listOf(
                                    Color(0xFFFF7A18),
                                    Color.Red
                                )
                            )
                        )
            ){

                Column(
                    modifier =
                        Modifier.padding(30.dp)
                ){

                    Text(
                        "Criar Conta",
                        color = Color.White,
                        fontSize = 42.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Text(
                        "Junte-se à comunidade\nde receitas",
                        color = Color.White
                    )
                }
            }

            Card(
                modifier =
                    Modifier
                        .fillMaxWidth()
                        .offset(y = (-40).dp)
                        .padding(20.dp),
                shape =
                    RoundedCornerShape(28.dp)
            ){

                Column(

                    modifier =
                        Modifier.padding(24.dp)

                ){

                    Text(
                        "Cadastro",
                        fontSize = 32.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(
                        Modifier.height(20.dp)
                    )

                    OutlinedTextField(
                        value = nome,
                        onValueChange = {
                            nome = it
                        },
                        label = {
                            Text("Nome Completo")
                        },
                        modifier =
                            Modifier.fillMaxWidth(),
                        shape =
                            RoundedCornerShape(18.dp)
                    )

                    Spacer(
                        Modifier.height(16.dp)
                    )

                    OutlinedTextField(
                        value = email,
                        onValueChange = {
                            email = it
                        },
                        label = {
                            Text("Email")
                        },
                        modifier =
                            Modifier.fillMaxWidth(),
                        shape =
                            RoundedCornerShape(18.dp)
                    )

                    Spacer(
                        Modifier.height(16.dp)
                    )

                    OutlinedTextField(
                        value = senha,
                        onValueChange = {
                            senha = it
                        },
                        label = {
                            Text("Senha")
                        },
                        modifier =
                            Modifier.fillMaxWidth(),
                        shape =
                            RoundedCornerShape(18.dp)
                    )

                    Spacer(
                        Modifier.height(16.dp)
                    )

                    OutlinedTextField(
                        value = confirmarSenha,
                        onValueChange = {
                            confirmarSenha = it
                        },
                        label = {
                            Text("Confirmar Senha")
                        },
                        modifier =
                            Modifier.fillMaxWidth(),
                        shape =
                            RoundedCornerShape(18.dp)
                    )

                    Spacer(
                        Modifier.height(24.dp)
                    )

                    Text(
                        "Tipo de Conta",
                        fontWeight =
                            FontWeight.Bold
                    )

                    Spacer(
                        Modifier.height(12.dp)
                    )

                    Row(
                        modifier =
                            Modifier.fillMaxWidth(),
                        horizontalArrangement =
                            Arrangement.spacedBy(8.dp)
                    ){

                        FilterChip(
                            modifier =
                                Modifier.weight(1f),
                            selected =
                                tipoConta == "usuario",
                            onClick = {
                                tipoConta = "usuario"
                            },
                            label = {
                                Text("👤 Usuário")
                            }
                        )

                        FilterChip(
                            modifier =
                                Modifier.weight(1f),
                            selected =
                                tipoConta == "nutricionista",
                            onClick = {
                                tipoConta = "nutricionista"
                            },
                            label = {
                                Text("🩺 Nutricionista")
                            }
                        )
                    }

                    if(tipoConta == "nutricionista"){
                        Spacer(
                            Modifier.height(16.dp)
                        )

                        OutlinedTextField(
                            value = crn,
                            onValueChange = {
                                crn = it
                            },
                            label = {
                                Text("CRN")
                            },
                            modifier =
                                Modifier.fillMaxWidth(),
                            shape =
                                RoundedCornerShape(18.dp)
                        )

                        Spacer(
                            Modifier.height(16.dp)
                        )

                        OutlinedTextField(
                            value = especialidade,
                            onValueChange = {
                                especialidade = it
                            },
                            label = {
                                Text("Especialidade")
                            },
                            modifier =
                                Modifier.fillMaxWidth(),
                            shape =
                                RoundedCornerShape(18.dp)
                        )
                    }

                    Spacer(
                        Modifier.height(20.dp)
                    )

                    if(erro.isNotEmpty()){

                        Text(
                            text = erro,
                            color = Color.Red
                        )

                        Spacer(
                            Modifier.height(12.dp)
                        )

                    }

                    Button(

                        onClick = {

                            when{

                                nome.isBlank() ||
                                        email.isBlank() ||
                                        senha.isBlank() ||
                                        confirmarSenha.isBlank() -> {

                                    erro = "Preencha todos os campos."

                                }

                                senha != confirmarSenha -> {

                                    erro = "As senhas não coincidem."

                                }

                                tipoConta == "nutricionista" &&
                                        (crn.isBlank() || especialidade.isBlank()) -> {

                                    erro = "Preencha CRN e Especialidade."

                                }

                                else -> {
                                    erro = ""
                                    UsuarioAtual.nome = nome
                                    UsuarioAtual.email = email
                                    UsuarioAtual.tipoConta = tipoConta
                                    nav.navigate("perfil")
                                }
                            }
                        },

                        modifier =
                            Modifier.fillMaxWidth(),
                        shape =
                            RoundedCornerShape(18.dp)
                    ){

                        Text(
                            "Criar Conta"
                        )
                    }

                    Spacer(
                        Modifier.height(12.dp)
                    )

                    TextButton(
                        onClick = {
                            nav.navigate("login")
                        }
                    ){

                        Text(
                            "Já possui uma conta?"
                        )
                    }
                }
            }

            Spacer(
                Modifier.height(120.dp)
            )
        }
    }
}