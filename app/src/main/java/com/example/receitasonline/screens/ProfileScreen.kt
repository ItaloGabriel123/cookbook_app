package com.example.receitasonline.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.receitasonline.data.UsuarioAtual

@Composable
fun ProfileScreen() {

    Column(
        modifier =
            Modifier.fillMaxSize()
    ) {

        Column(

            modifier =
                Modifier
                    .fillMaxWidth()
                    .background(

                        Brush.horizontalGradient(

                            listOf(
                                Color(0xFFFF7A18),
                                Color.Red
                            )

                        )

                    )
                    .padding(24.dp)

        ) {

            Text(

                "👤 Meu Perfil",

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

                "Gerencie sua conta",

                color =
                    Color.White.copy(alpha = 0.9f)

            )

        }

        Card(

            modifier =
                Modifier
                    .fillMaxWidth()
                    .padding(20.dp),

            shape =
                RoundedCornerShape(24.dp),

            colors =
                CardDefaults.cardColors(

                    containerColor =
                        Color(0xFFFFF7F1)

                )

        ) {

            Column(

                modifier =
                    Modifier
                        .fillMaxWidth()
                        .padding(24.dp),

                horizontalAlignment =
                    Alignment.CenterHorizontally

            ) {

                Surface(

                    modifier =
                        Modifier.size(90.dp),

                    shape =
                        CircleShape,

                    color =
                        Color(0xFFFFE0B2)

                ) {

                    Box(
                        contentAlignment =
                            Alignment.Center
                    ) {

                        Text(
                            "👤",
                            fontSize = 42.sp
                        )

                    }

                }

                Spacer(
                    Modifier.height(16.dp)
                )

                Text(
                    UsuarioAtual.nome
                )

                Spacer(
                    Modifier.height(4.dp)
                )

                Spacer(
                    Modifier.height(4.dp)
                )

                Text(
                    UsuarioAtual.email
                )

                Text(
                    if(UsuarioAtual.tipoConta == "nutricionista")
                        "🩺 Nutricionista"
                    else
                        "👤 Usuário"
                )
            }
        }

        Row(
            modifier =
                Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp),
            horizontalArrangement =
                Arrangement.spacedBy(12.dp)
        ) {

            StatCard("12", "Receitas")
            StatCard("24", "Favoritos")
            StatCard("89", "Curtidas")
        }

        Spacer(
            Modifier.height(20.dp)
        )

        MenuCard("📖", "Minhas Receitas")
        MenuCard("❤️", "Meus Favoritos")
        MenuCard("⚙️", "Configurações")
        MenuCard("🚪", "Sair")

        Spacer(
            Modifier.height(140.dp)
        )
    }
}

@Composable
fun StatCard(
    numero:String,
    titulo:String
){

    Card(
        modifier =
            Modifier
                .width(105.dp)
                .height(90.dp),

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
                Modifier.fillMaxSize(),
            verticalArrangement =
                Arrangement.Center,
            horizontalAlignment =
                Alignment.CenterHorizontally
        ){

            Text(
                numero,
                fontWeight =
                    FontWeight.Bold,
                fontSize =
                    22.sp
            )

            Text(
                titulo,
                color =
                    Color.Gray,
                fontSize =
                    12.sp
            )
        }
    }
}

@Composable
fun MenuCard(
    emoji:String,
    titulo:String
){

    Card(
        modifier =
            Modifier
                .fillMaxWidth()
                .padding(
                    horizontal = 20.dp,
                    vertical = 6.dp
                ),

        shape =
            RoundedCornerShape(20.dp),

        colors =
            CardDefaults.cardColors(

                containerColor =
                    Color(0xFFFFF7F1)
            )
    ){

        Row(
            modifier =
                Modifier
                    .fillMaxWidth()
                    .padding(18.dp),
            verticalAlignment =
                Alignment.CenterVertically
        ){

            Text(
                emoji,
                fontSize = 24.sp
            )

            Spacer(
                Modifier.width(16.dp)
            )

            Text(
                titulo,
                fontWeight =
                    FontWeight.SemiBold,
                fontSize =
                    16.sp
            )
        }
    }
}