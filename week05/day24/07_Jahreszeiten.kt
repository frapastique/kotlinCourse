fun main() {
    val monate: List<String> = listOf(
        "Januar", "Februar", "März", "April", "Mai", "Juni",
        "Juli", "August", "September", "Oktober", "November", "Dezember"
    )
    println(monate)

    for (i in monate) {
        if (i == "Januar" || i == "Februar" || i == "Dezember") {
            println("Der $i ist im Winter.")
            continue
        } else if (i == "März" || i == "April" || i == "Mai") {
            println("Der $i ist im Frühling.")
            continue
        } else if (i == "Juni" || i == "Juli" || i == "August") {
            println("Der $i ist im Sommer.")
            continue
        } else if (i == "September" || i == "Oktober" || i == "November") {
            println("Der $i ist im Herbst.")
            continue
        } else {
            break
        }
    }
}