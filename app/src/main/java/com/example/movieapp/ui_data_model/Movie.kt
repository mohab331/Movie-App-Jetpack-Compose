package com.example.movieapp.ui_data_model

data class Movie(
    val id: Int,
    val title: String,
    val description: String,
    val director: String,
    val releaseYear: Int,
    val genre: String,
    val rating: Double,
    val durationMinutes: Int,
    val image: String,
    val imagesList: List<String>,
    val cast: List<String>
)

