package com.example.movieapp.utils

import com.example.movieapp.ui_data_model.Movie


object MockData {
    private val movieList = listOf(
        Movie(
            id = 1,
            title = "Inception",
            description = "A mind-bending thriller",
            director = "Christopher Nolan",
            releaseYear = 2010,
            genre = "Sci-Fi",
            rating = 8.8,
            durationMinutes = 148,
            image = "https://images.unsplash.com/photo-1603791440384-56cd371ee9a7?w=800",
            imagesList = listOf("https://picsum.photos/id/1015/800/1200", "https://picsum.photos/id/1016/800/1200"),
            cast = listOf("Leonardo DiCaprio", "Joseph Gordon-Levitt", "Elliot Page")
        ),
        Movie(
            2, "Interstellar", "A space-time epic", "Christopher Nolan", 2014, "Sci-Fi", 8.6, 169,
            "https://images.unsplash.com/photo-1504384308090-c894fdcc538d?w=800",
            listOf("https://picsum.photos/id/1025/800/1200", "https://picsum.photos/id/1035/800/1200"),
            listOf("Matthew McConaughey", "Anne Hathaway", "Jessica Chastain")
        ),
        Movie(
            3, "The Dark Knight", "The legendary Batman film", "Christopher Nolan", 2008, "Action", 9.0, 152,
            "https://images.unsplash.com/photo-1581905764498-b9f2d50f36d8?w=800",
            listOf("https://picsum.photos/id/1040/800/1200", "https://picsum.photos/id/1050/800/1200"),
            listOf("Christian Bale", "Heath Ledger", "Aaron Eckhart")
        ),
        Movie(
            4, "Tenet", "Time inversion action-packed thriller", "Christopher Nolan", 2020, "Sci-Fi", 7.3, 150,
            "https://images.unsplash.com/photo-1601933470928-c97a4eb1cd3e?w=800",
            listOf("https://picsum.photos/id/1060/800/1200", "https://picsum.photos/id/1070/800/1200"),
            listOf("John David Washington", "Robert Pattinson", "Elizabeth Debicki")
        ),
        Movie(
            5, "Dunkirk", "A gripping World War II survival story", "Christopher Nolan", 2017, "War", 7.9, 106,
            "https://images.unsplash.com/photo-1579125492347-4e7018379f67?w=800",
            listOf("https://picsum.photos/id/1080/800/1200", "https://picsum.photos/id/1090/800/1200"),
            listOf("Fionn Whitehead", "Tom Hardy", "Mark Rylance")
        ),
        Movie(
            6, "The Prestige", "Two magicians in a deadly rivalry", "Christopher Nolan", 2006, "Drama", 8.5, 130,
            "https://images.unsplash.com/photo-1581091012184-7e0cdfbb6791?w=800",
            listOf("https://picsum.photos/id/1100/800/1200", "https://picsum.photos/id/1110/800/1200"),
            listOf("Hugh Jackman", "Christian Bale", "Scarlett Johansson")
        ),
        Movie(
            7, "Memento", "A man with short-term memory loss seeks revenge", "Christopher Nolan", 2000, "Mystery", 8.4, 113,
            "https://images.unsplash.com/photo-1525182008055-f88b95ff7980?w=800",
            listOf("https://picsum.photos/id/1120/800/1200", "https://picsum.photos/id/1130/800/1200"),
            listOf("Guy Pearce", "Carrie-Anne Moss", "Joe Pantoliano")
        ),
        Movie(
            8, "The Matrix", "Reality is an illusion", "The Wachowskis", 1999, "Sci-Fi", 8.7, 136,
            "https://images.unsplash.com/photo-1622495895460-35a628b5f174?w=800",
            listOf("https://picsum.photos/id/1140/800/1200", "https://picsum.photos/id/1150/800/1200"),
            listOf("Keanu Reeves", "Laurence Fishburne", "Carrie-Anne Moss")
        ),
        Movie(
            9, "Gladiator", "A Roman general turned gladiator seeks justice", "Ridley Scott", 2000, "Action", 8.5, 155,
            "https://images.unsplash.com/photo-1622611070130-27a1079971e2?w=800",
            listOf("https://picsum.photos/id/1160/800/1200", "https://picsum.photos/id/1170/800/1200"),
            listOf("Russell Crowe", "Joaquin Phoenix", "Connie Nielsen")
        ),
        Movie(
            10, "The Shawshank Redemption", "Hope and friendship in prison", "Frank Darabont", 1994, "Drama", 9.3, 142,
            "https://images.unsplash.com/photo-1581091012301-ec3ebc4b9c91?w=800",
            listOf("https://picsum.photos/id/1180/800/1200", "https://picsum.photos/id/1190/800/1200"),
            listOf("Tim Robbins", "Morgan Freeman", "Bob Gunton")
        )
    )

    fun getMovies(): List<Movie> = movieList

    fun getMovieById(movieId: Int): Movie = movieList.first { it.id == movieId }
}

