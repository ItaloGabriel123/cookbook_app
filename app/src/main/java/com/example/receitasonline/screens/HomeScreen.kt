package com.example.receitasonline.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.receitasonline.R

@Composable
fun HomeScreen() {
    // Removido o Scaffold interno para evitar duplicidade com a navegação principal
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        item {
            Header()
            Hero()
            Beneficios()

            Titulo(
                "Explore por Categorias",
                "Encontre receitas organizadas por temas"
            )

            CategoriaCard(
                "Receitas de Airfryer",
                "Pratos preparados na fritadeira",
                R.drawable.airfryer,
                "🔥"
            )

            CategoriaCard(
                "Molhos e Acompanhamentos",
                "Complementos perfeitos",
                R.drawable.molhos,
                "💧"
            )

            Titulo(
                "Receitas em Destaque",
                "As mais populares"
            )

            ReceitaGrande(
                R.drawable.airfryer
            )

            Humor()
            Objetivos()
            CTAFinal()

            Spacer(Modifier.height(40.dp))
        }
    }
}

@Composable
fun Header() {
    Row(
        Modifier
            .fillMaxWidth()
            .padding(20.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            "🍳 CookBook",
            fontWeight = FontWeight.Bold,
            fontSize = 28.sp
        )
        Row {
            Icon(Icons.Outlined.Search, null)
            Spacer(Modifier.width(18.dp))
            Icon(Icons.Outlined.Menu, null)
        }
    }
}

@Composable
fun Hero() {
    Column(
        Modifier
            .background(
                Brush.horizontalGradient(
                    listOf(Color(0xFFFF7300), Color(0xFFFF3355))
                )
            )
            .padding(20.dp)
    ) {
        Text(
            "Descubra Receitas Incríveis",
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 34.sp
        )
        Spacer(Modifier.height(12.dp))
        Text(
            "Explore milhares de receitas",
            color = Color.White
        )
        Spacer(Modifier.height(20.dp))

        // AsyncImage do Coil carrega imagens pesadas sem travar o celular
        AsyncImage(
            model = R.drawable.banner,
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp)
                .clip(RoundedCornerShape(22.dp)),
            contentScale = ContentScale.Crop
        )

        Spacer(Modifier.height(18.dp))

        Button(
            onClick = {},
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.White,
                contentColor = Color.Black
            )
        ) {
            Text("Explorar Receitas")
        }
    }
}

@Composable
fun Beneficios() {
    Column {
        Beneficio("❤", "Comunidade Ativa")
        Beneficio("🧠", "IA Inteligente")
        Beneficio("✨", "Dicas de Saúde")
    }
}

@Composable
fun Beneficio(emoji: String, titulo: String) {
    Row(
        Modifier.padding(20.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            Modifier
                .size(60.dp)
                .background(Color(0xFFFDECD5), CircleShape),
            contentAlignment = Alignment.Center
        ) {
            Text(emoji, fontSize = 20.sp)
        }
        Spacer(Modifier.width(20.dp))
        Text(
            titulo,
            fontWeight = FontWeight.Bold,
            fontSize = 22.sp
        )
    }
}

@Composable
fun Titulo(titulo: String, sub: String) {
    Column(Modifier.padding(20.dp)) {
        Text(
            titulo,
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp
        )
        Text(sub, color = Color.Gray)
    }
}

@Composable
fun CategoriaCard(titulo: String, desc: String, img: Int, emoji: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
            .height(220.dp),
        shape = RoundedCornerShape(24.dp)
    ) {
        Box {
            AsyncImage(
                model = img,
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )

            Box(
                Modifier
                    .fillMaxSize()
                    .background(Color.Black.copy(0.45f))
            )

            Column(
                Modifier.align(Alignment.Center),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(emoji, fontSize = 28.sp)
                Spacer(Modifier.height(12.dp))
                Text(
                    titulo,
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 28.sp
                )
                Text(
                    desc,
                    color = Color.White
                )
            }
        }
    }
}

@Composable
fun ReceitaGrande(img: Int) {
    AsyncImage(
        model = img,
        contentDescription = null,
        modifier = Modifier
            .fillMaxWidth()
            .height(280.dp)
            .padding(horizontal = 20.dp)
            .clip(RoundedCornerShape(24.dp)),
        contentScale = ContentScale.Crop
    )
}

@Composable
fun Humor() {
    Titulo("Receitas por Humor", "Escolha conforme o momento")
}

@Composable
fun Objetivos() {
    Titulo("Receitas por Objetivos", "Receitas personalizadas")
}

@Composable
fun CTAFinal() {
    Column(
        Modifier
            .fillMaxWidth()
            .background(
                Brush.horizontalGradient(
                    listOf(Color(0xFFFF7300), Color(0xFFFF3355))
                )
            )
            .padding(30.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            "Pronto para Compartilhar?",
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp
        )
        Spacer(Modifier.height(16.dp))
        Button(
            onClick = {},
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.White,
                contentColor = Color.Black
            )
        ) {
            Text("Adicionar Minha Receita")
        }
    }
}
