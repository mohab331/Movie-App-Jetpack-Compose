package com.example.movieapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.movieapp.screens.details.MovieDetailScreen
import com.example.movieapp.screens.home.HomeScreen

@Composable
fun MovieNavGraph(
    navController: NavHostController = rememberNavController(),
    startDestination: String = Screen.Home.route
) {
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable(Screen.Home.route) {
            HomeScreen(navController)
        }
        composable(
            route = Screen.MovieDetail.route,
            arguments = listOf(navArgument(NavArgs.MOVIE_ID) { type = NavType.IntType },
                navArgument(NavArgs.TITLE) {
                    type = NavType.StringType
                    defaultValue = ""
                    nullable = true
                }
            )
        ) {
            val movieId = it.arguments?.getInt(NavArgs.MOVIE_ID) ?: 0
            val title = it.arguments?.getString(NavArgs.TITLE).orEmpty()
            MovieDetailScreen(movieId, navController)
        }
    }
}