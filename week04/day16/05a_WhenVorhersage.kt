package week.`4`.day.`16`.Tag16_Projekt.Aufgabe5.src

fun main() {
    val nationality: String = "japanese"

    when (nationality) {
        "german" -> println("Nationalität: Deutsch")
        "italian" -> println("Nationalität: Italienisch")
        "japanese" -> println("Nationalität: Japanisch")
        "namibian" -> println("Nationalität: Namibisch")
        "brazilian" -> println("Nationalität: Brasilianisch")
        else -> println("Nationalität nicht in Datenbank")
    }
}