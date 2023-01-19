fun main() {
    val monate: List<String> = listOf(
        "Januar", "Februar", "März", "April", "Mai", "Juni",
        "Juli", "August", "September", "Oktober", "November", "Dezember"
    )
    println(monate)

    val randomMonat: String = monate.random()
    println("\nTask a:\nDer Monat $randomMonat ist im ${checkSeason(randomMonat)}.")

    println("\nTask b:\n")
    for (i in monate) {
        if (checkSeason(i) == "Winter") {
            println("Der Monat $i ist im Winter.")
            continue
        }
        if (checkSeason(i) == "Frühling") {
            println("Der Monat $i ist im Frühling.")
            continue
        }
        if (checkSeason(i) == "Sommer") {
            println("Der Monat $i ist im Sommer.")
            continue
        }
        if (checkSeason(i) == "Herbst") {
            println("Der Monat $i ist im Herbst.")
            continue
        }
    }
}

fun checkSeason(month: String): String {
    var season: String = ""
    when (month) {
        "Dezember", "Januar", "Februar" -> {
            season = "Winter"
        }
        "März", "April", "Mai" -> {
            season = "Frühling"
        }
        "Juni", "Juli", "August" -> {
            season = "Sommer"
        }
        "September", "Oktober", "November" -> {
            season = "Herbst"
        }
    }
    return season
}