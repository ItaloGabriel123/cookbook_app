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
import androidx.navigation.NavController

@Composable
fun HomeScreen(
    nav: NavController
){
    LazyColumn(
        modifier =
            Modifier.fillMaxSize()
    ){

        item {
            Header()
            Hero()
            Beneficios()

            Titulo(
                "Explore por Categorias",
                "Encontre receitas organizadas"
            )

            Row(
                modifier =
                    Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp),
                horizontalArrangement =
                    Arrangement.spacedBy(12.dp)
            ){

                CategoriaMini(
                    "Airfryer",
                    R.drawable.airfryer
                )

                CategoriaMini(
                    "Molhos",
                    R.drawable.molhos
                )
            }

            Titulo(
                "Receitas em Destaque",
                "As mais populares"
            )

            ReceitaGrande(

                imagem = R.drawable.airfryer,

            )

            Titulo(
                "Receitas por Humor",
                "Escolha conforme seu momento"
            )

            Humor()

            Titulo(
                "Receitas por Objetivo",
                "Receitas personalizadas"
            )

            Objetivos()

            Titulo(
                "Receitas para Você",
                "Selecionadas especialmente"
            )

            ReceitasParaVoce(nav)

            CTAFinal()
            Spacer(

                Modifier.height(
                    120.dp
                )
            )
        }
    }
}

@Composable
fun Header(){

    Row(
        modifier =
            Modifier
                .fillMaxWidth()
                .padding(
                    horizontal = 20.dp,
                    vertical = 26.dp
                ),

        horizontalArrangement =
            Arrangement.SpaceBetween,

        verticalAlignment =
            Alignment.CenterVertically

    ){

        Text(
            "🍳 CookBook",
            fontWeight =
                FontWeight.Bold,
            fontSize =
                30.sp
        )

        Row {

            Icon(
                Icons.Outlined.Search,
                null,
                modifier =
                    Modifier.size(22.dp)
            )

            Spacer(
                Modifier.width(20.dp)
            )

            Icon(
                Icons.Outlined.Menu,
                null,
                modifier =
                    Modifier.size(22.dp)
            )
        }
    }
}

@Composable
fun Hero(){

    Column(
        modifier =
            Modifier
                .fillMaxWidth()
                .background(

                    Brush.horizontalGradient(

                        listOf(
                            Color(0xFFFF7A18),
                            Color(0xFFFF4E50)

                        )
                    )
                )
                .padding(
                    horizontal = 28.dp,
                    vertical = 24.dp
                )
    ){

        OutlinedTextField(

            value = "",
            onValueChange = {},
            placeholder = {

                Text(
                    "Pesquisar receitas..."
                )
            },

            shape =
                RoundedCornerShape(
                    30.dp
                ),

            modifier =
                Modifier.fillMaxWidth(),

            colors =
                OutlinedTextFieldDefaults.colors(

                    unfocusedContainerColor =
                        Color.White,
                    focusedContainerColor =
                        Color.White,
                    focusedBorderColor =
                        Color.Transparent,
                    unfocusedBorderColor =
                        Color.Transparent

                )
        )

        Spacer(
            Modifier.height(30.dp)
        )

        Text(
            "Descubra Receitas\nIncríveis",
            color =
                Color.White,
            fontWeight =
                FontWeight.Bold,
            fontSize =
                40.sp,
            lineHeight =
                40.sp
        )

        Spacer(
            Modifier.height(12.dp)
        )

        Text(
            "Explore milhares de receitas,\ncompartilhe experiências",
            color =
                Color.White,
            fontSize =
                17.sp
        )

        Spacer(
            Modifier.height(24.dp)
        )

        AsyncImage(
            model =
                R.drawable.banner,
            contentDescription =
                null,
            modifier =
                Modifier
                    .fillMaxWidth()
                    .height(180.dp)
                    .clip(
                        RoundedCornerShape(
                            24.dp
                        )
                    ),

            contentScale =
                ContentScale.Crop
        )

        Spacer(
            Modifier.height(24.dp)
        )

        Button(
            onClick = {},
            modifier =
                Modifier
                    .fillMaxWidth()
                    .height(54.dp),
            shape =
                RoundedCornerShape(50.dp),
            colors =
                ButtonDefaults.buttonColors(
                    containerColor =
                        Color(0xFFFF8A00)
                )
        ) {

            Text(
                "Explorar Receitas",
                fontSize =
                    18.sp
            )
        }
    }
}

@Composable
fun Beneficios(){

    Column {

        Beneficio(
            "❤",
            "Comunidade Ativa"

        )

        Beneficio(
            "🧠",
            "IA Inteligente"
        )

        Beneficio(
            "✨",
            "Saúde"
        )
    }
}
@Composable
fun Beneficio(
    emoji:String,
    titulo:String
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
            RoundedCornerShape(22.dp),

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

            Box(
                modifier =
                    Modifier
                        .size(64.dp)
                        .background(
                            Color.White,
                            CircleShape
                        ),

                contentAlignment =
                    Alignment.Center
            ){

                Text(
                    emoji,
                    fontSize =
                        28.sp
                )
            }
            Spacer(
                Modifier.width(18.dp)
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
                    Modifier.height(6.dp)
                )

                Text(
                    when(titulo){
                        "Comunidade Ativa" ->
                            "Compartilhe receitas"

                        "IA Inteligente" ->
                            "Sugestões personalizadas"

                        else ->
                            "Dicas alimentares"
                    },

                    color =
                        Color.Gray,
                    fontSize =
                        13.sp,
                    lineHeight =
                        16.sp
                )
            }
        }
    }
}

@Composable
fun Titulo(
    titulo:String,
    sub:String
){

    Column(
        Modifier.padding(20.dp)

    ){

        Text(
            titulo,
            fontWeight =
                FontWeight.Bold,
            fontSize =
                30.sp
        )

        Text(sub)
    }
}

@Composable
fun CategoriaMini(
    titulo:String,
    imagem:Int
){

    Card(
        modifier =
            Modifier
                .width(170.dp)
                .height(200.dp),
        shape =
            RoundedCornerShape(
                24.dp
            )
    ){

        Box {

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
                Modifier
                    .fillMaxSize()
                    .background(
                        Color.Black.copy(
                            alpha = 0.45f
                        )
                    )
            )

            Column(
                modifier =
                    Modifier.align(
                        Alignment.Center
                    ),

                horizontalAlignment =
                    Alignment.CenterHorizontally
            ){

                Text(
                    "🍽",
                    fontSize =
                        28.sp
                )

                Spacer(
                    Modifier.height(
                        10.dp
                    )
                )

                Text(
                    titulo,
                    color =
                        Color.White,
                    fontWeight =
                        FontWeight.Bold,
                    fontSize =
                        22.sp
                )
            }
        }
    }
}

@Composable
fun ReceitaGrande(
    imagem:Int
){

    Card(
        modifier =
            Modifier
                .fillMaxWidth()
                .padding(
                    horizontal = 20.dp
                ),

        shape =
            RoundedCornerShape(
                24.dp
            )
    ){

        Column {

            AsyncImage(
                model =
                    imagem,
                contentDescription =
                    null,
                modifier =
                    Modifier
                        .fillMaxWidth()
                        .height(
                            260.dp
                        ),

                contentScale =
                    ContentScale.Crop

            )

            Column(

                Modifier.padding(
                    18.dp
                )
            ){

                Text(
                    "Receitas em Destaque",
                    fontWeight =
                        FontWeight.Bold,
                    fontSize =
                        24.sp
                )

                Spacer(
                    Modifier.height(
                        10.dp
                    )
                )

                Text(
                    "As mais populares da comunidade",
                    color =
                        Color.Gray
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
                        RoundedCornerShape(50.dp)
                ){

                    Text(
                        "Ver Todas →",
                        fontSize =
                            16.sp

                    )
                }
            }
        }
    }
}

@Composable
fun Humor(){

    Column(
        modifier =
            Modifier.padding(
                horizontal = 20.dp
            )
    ){

        Row(
            horizontalArrangement =
                Arrangement.spacedBy(12.dp)
        ){

            HumorCard(
                "😊",
                "Feliz"
            )

            HumorCard(
                "😴",
                "Cansado"
            )
        }

        Spacer(
            Modifier.height(12.dp)
        )

        Row(
            horizontalArrangement =
                Arrangement.spacedBy(12.dp)
        ){

            HumorCard(
                "🔥",
                "Animado"
            )

            HumorCard(
                "🤒",
                "Leve"
            )
        }
    }
}

@Composable
fun HumorCard(
    emoji:String,
    texto:String
){

    Card(
        modifier =
            Modifier
                .width(160.dp)
                .height(130.dp),
        shape =
            RoundedCornerShape(
                22.dp
            ),
        colors =
            CardDefaults.cardColors(
                containerColor =
                    Color(0xFFFFF7FB)
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
                emoji,
                fontSize = 30.sp
            )

            Text(
                texto
            )
        }
    }
}

@Composable
fun Objetivos(){

    Column(
        modifier =
            Modifier.padding(
                horizontal = 20.dp
            )
    ){

        Row(
            horizontalArrangement =
                Arrangement.spacedBy(
                    12.dp
                )
        ){

            ObjetivoCard(
                "⬇",
                "Emagrecer"
            )

            ObjetivoCard(
                "⬆",
                "Ganhar Peso"
            )
        }

        Spacer(
            Modifier.height(12.dp)
        )

        Row(
            horizontalArrangement =
                Arrangement.spacedBy(
                    12.dp
                )
        ){

            ObjetivoCard(
                "🍎",
                "Saudável"
            )

            ObjetivoCard(
                "⏱",
                "Rápido"
            )
        }
    }
}

@Composable
fun ObjetivoCard(
    emoji:String,
    titulo:String
){

    Card(
        modifier =
            Modifier
                .width(165.dp)
                .height(140.dp),
        shape =
            RoundedCornerShape(
                24.dp
            ),
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
                emoji,
                fontSize =
                    34.sp
            )

            Text(
                titulo,
                fontWeight =
                    FontWeight.Bold,
                fontSize =
                    16.sp
            )
        }
    }
}

@Composable
fun ReceitasParaVoce(
    nav: NavController
){

    Column {

        ReceitaPequena(
            "Frango na Airfryer",
            "25 min",
            R.drawable.airfryer,
            "receita_airfryer",
            nav
        )

        ReceitaPequena(
            "Sobremesa Especial",
            "15 min",
            R.drawable.sobremesa,
            "receita_sobremesa",
            nav
        )

        ReceitaPequena(
            "Prato Vegano",
            "20 min",
            R.drawable.vegano,
            "receita_vegana",
            nav
        )
    }
}

@Composable
fun ReceitaPequena(
    titulo:String,
    tempo:String,
    imagem:Int,
    rota:String,
    nav: NavController
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
            RoundedCornerShape(24.dp),

        colors =
            CardDefaults.cardColors(

                containerColor =
                    Color(0xFFFFF7F1)

            )
    ){

        Column {

            AsyncImage(
                model =
                    imagem,
                contentDescription =
                    null,
                modifier =
                    Modifier
                        .fillMaxWidth()
                        .height(180.dp),
                contentScale =
                    ContentScale.Crop
            )

            Column(
                modifier =
                    Modifier.padding(18.dp)

            ) {

                Text(
                    titulo,
                    fontWeight =
                        FontWeight.Bold,
                    fontSize =
                        22.sp

                )

                Spacer(
                    Modifier.height(6.dp)
                )

                Text(
                    "Tempo: $tempo",
                    color =
                        Color.Gray
                )
                Spacer(
                    Modifier.height(16.dp)
                )

                Button(
                    onClick = {
                        nav.navigate(rota)
                    },
                    modifier =
                        Modifier.fillMaxWidth(),
                    shape =
                        RoundedCornerShape(50.dp)
                ){

                    Text(
                        "Ver Receita"
                    )
                }
            }
        }
    }
}


@Composable
fun CTAFinal(){

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
                .padding(
                    horizontal = 24.dp,
                    vertical = 40.dp
                ),

        horizontalAlignment =
            Alignment.CenterHorizontally
    ){

        Text(
            "Pronto para\nCompartilhar?",
            color =
                Color.White,
            fontWeight =
                FontWeight.Bold,
            fontSize =
                34.sp,
            lineHeight =
                38.sp
        )

        Spacer(
            Modifier.height(18.dp)
        )

        Button(
            onClick = {},
            modifier =
                Modifier.fillMaxWidth(),
            shape =
                RoundedCornerShape(
                    50.dp
                ),

            colors =
                ButtonDefaults.buttonColors(
                    containerColor =
                        Color.White
                )
        ){

            Text(
                "Adicionar Minha Receita",
                color =
                    Color(0xFFFF7A18),
                fontWeight =
                    FontWeight.Bold
            )
        }
    }
}