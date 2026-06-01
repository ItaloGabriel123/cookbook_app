package com.example.receitasonline.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.*
import com.example.receitasonline.R
import com.example.receitasonline.components.BottomBar
import com.example.receitasonline.screens.*

@Composable
fun AppNavigation() {

    val nav = rememberNavController()

    Scaffold(
        bottomBar = {
            BottomBar(nav)
        }
    ) { padding ->

        NavHost(
            navController = nav,
            startDestination = "home",
            modifier = Modifier.padding(padding)
        ) {

            composable("home") {
                HomeScreen(nav)
            }

            composable("favoritos") {
                FavoritesScreen()
            }

            composable("login"){
                LoginScreen(nav)
            }

            composable("register"){
                RegisterScreen(nav)
            }

            composable("perfil"){
                ProfileScreen()
            }

            composable("add") {
                AddRecipeScreen()
            }

            composable("receita_airfryer") {
                RecipeDetailScreen(
                    nav = nav,
                    titulo = "Frango na Airfryer",
                    tempo = "25 min",
                    descricao =
                        "Receita crocante e prática para o dia a dia.",
                    imagem =
                        R.drawable.airfryer,
                    ingredientes = listOf(
                        "500g de frango",
                        "1 colher de páprica",
                        "Sal a gosto",
                        "Azeite"
                    ),
                    preparo = listOf(
                        "Tempere o frango.",
                        "Pré-aqueça a airfryer.",
                        "Asse por 20 minutos.",
                        "Sirva quente."
                    )
                )
            }

            composable("receita_sobremesa"){
                RecipeDetailScreen(
                    nav = nav,
                    titulo = "Sorvete Especial",
                    tempo = "15 min",
                    descricao =
                        "Sorvete cremoso e refrescante, perfeito para dias quentes.",
                    imagem =
                        R.drawable.sobremesa,
                    ingredientes =
                        listOf(
                            "500ml de creme de leite",
                            "1 lata de leite condensado",
                            "1 colher de chá de essência de baunilha",
                            "Granulado colorido para decorar"
                        ),
                    preparo =
                        listOf(
                            "Misture o creme de leite e o leite condensado.",
                            "Adicione a essência de baunilha.",
                            "Leve ao congelador por aproximadamente 4 horas.",
                            "Sirva em bolas e finalize com granulado colorido."
                        )
                )
            }

            composable("receita_vegana") {
                RecipeDetailScreen(
                    nav = nav,
                    titulo = "Prato Vegano",
                    tempo = "20 min",
                    descricao =
                        "Receita saudável preparada apenas com ingredientes vegetais.",
                    imagem =
                        R.drawable.vegano,
                    ingredientes = listOf(
                        "Grão-de-bico",
                        "Tomate",
                        "Cebola roxa",
                        "Salsinha"
                    ),

                    preparo = listOf(
                        "Cozinhe o grão-de-bico.",
                        "Corte os vegetais.",
                        "Misture tudo.",
                        "Tempere e sirva."
                    )
                )
            }
        }
    }
}