fun main() {
    val monate: List<String> = listOf(
        "Januar", "Februar", "März", "April", "Mai", "Juni",
        "Juli", "August", "September", "Oktober", "November", "Dezember"
    )
    println(monate)

    val randomMonat: String = monate.random()
    println("""
        
        Task a:
        Eine Funktion, die einen Monat als Parameter erhält und die Jahreszeit für den Monat zurückgibt.
        
        Randomisiert wurde der Monat $randomMonat ausgewählt welcher im ${checkSeason(randomMonat)} beheimatet ist.
        
        """.trimIndent())

    println("""
        Task b:
        Eine Schleife, die alle Monate mit ihrer Jahreszeit in der Konsole ausgibt.
        
        """.trimIndent())
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

    println("""
        
        Task c:
        Eine Schleife die nur die Sommermonate in der Konsole ausgibt.
        
        """.trimIndent())
    var sommerMonate: MutableList<String> = mutableListOf()
    for (i in monate) {
        if (checkSeason(i) == "Sommer") {
            sommerMonate.add(i)
            continue
        }
    }
    println("Die Monate ${sommerMonate.joinToString(", ")} sind im Sommer.")

    println("""
        
        Task d:
        Eine Schleife die alle Monate außer den Juni und den September ausgibt.
        
        """.trimIndent())
    for (i in monate) {
        if (i == "Juni") {
            continue
        }
        if (i == "September") {
            continue
        }
        println(i)
    }

    println("""
        
        Task e:
        Eine Schleife die ab dem März jeden zweiten Monat ausgibt.
        
        """.trimIndent())
    for (i in monate) {
        if (i != "März") {
            if (i == "April") {
                break
            }
            println(i)
        }
        if (i == "März") {
            for (j in monate.indexOf("März") until monate.size step 2) {
                println(monate[j])
            }
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