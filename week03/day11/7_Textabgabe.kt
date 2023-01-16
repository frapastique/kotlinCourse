/*
Schreibe hier deine Antwort hin:

Toy Story

 */

fun myFavoriteMovie() {
    val movies: MutableList<String> = mutableListOf("Matrix", "Avengers", "Der Pate", "Toy Story")
    val favMovie: String = movies[movies.size-1]
    println(favMovie)
}

fun main() {
    myFavoriteMovie()
}