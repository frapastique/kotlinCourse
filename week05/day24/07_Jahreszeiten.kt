fun main() {
    val monate: List<String> = listOf(
        "Januar", "Februar", "März", "April", "Mai", "Juni",
        "Juli", "August", "September", "Oktober", "November", "Dezember"
    )
    println(monate)

    val randomMonat: String = monate.random()
    println("Der Monat $randomMonat befindet sich im ${checkSeason(randomMonat)}.")
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