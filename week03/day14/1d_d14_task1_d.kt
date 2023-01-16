package week.`3`.day.`14`.Tag14_Projekt.Aufgabe1.src

// Oldboy

fun main() {
    printFilm(1)
}

fun printFilm(listenIndex: Int) {
    val lieblingsFilme: MutableList<String> = mutableListOf(
        "Batman", "Oldboy", "ES",
        "Harry Potter", "Pulp Fiction"
    )
    println(lieblingsFilme[listenIndex])
}