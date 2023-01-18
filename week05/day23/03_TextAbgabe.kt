/*
Schreibe hier deine Antwort hin.
        Am Montag muss ich arbeiten.
        Am Dienstag muss ich arbeiten.
        Am Mittwoch muss ich arbeiten.
        Am Donnerstag muss ich arbeiten.
        Am Freitag muss ich arbeiten.
        Am Samstag hab ich frei.
        Am Sonntag hab ich frei.
 */

fun main() {
    val weekDays: List<String> = listOf(
        "Montag", "Dienstag", "Mittwoch",
        "Donnerstag", "Freitag", "Samstag", "Sonntag"
    )
    for (day in weekDays) {
        if (day == "Samstag" || day == "Sonntag") {
            println("Am $day hab ich frei.");
        } else {
            println("Am $day muss ich arbeiten.");
        }
    }
}