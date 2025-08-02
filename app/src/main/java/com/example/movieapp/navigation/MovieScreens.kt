package com.example.movieapp.navigation


sealed class Screen(val route: String) {
    object Home : Screen("home")
    /// Required parameters → in {}
    /// Optional parameters → using ?key=value format
    object MovieDetail : Screen("movie_detail/{movieId}?title={title}") {
        fun pass(movieId: Int, title: String? = null): String {
            return if (title.isNullOrEmpty()) {
                "movie_detail/$movieId"
            } else {
                "movie_detail/$movieId?title=$title"
            }
        }
    }
}