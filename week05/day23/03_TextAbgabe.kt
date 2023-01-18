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

// Anlegen der main Funktion
fun main() {
    // Anlegen der Liste weekDays mit allen Wochentagen
    val weekDays: List<String> = listOf(
        "Montag", "Dienstag", "Mittwoch",
        "Donnerstag", "Freitag", "Samstag", "Sonntag"
    )
    // Anlegen einer for Schleife welche über die Liste iteriert und bei jedem Durchlauf einen folgenden
    // Wochentag in der Variable day weitergibt
    for (day in weekDays) {
        // Eine if Bedingung mit der Abfrage wenn day gleich Samstag oder day gleich Sonntag
        if (day == "Samstag" || day == "Sonntag") {
            // Wenn beim Iterieren über die Liste weekDays die Variable day Samstag oder Sonntag übergibt wird:
            // Am Samstag/Sonntag hab ich frei jeweils einzeln in der Konsole ausgegeben
            println("Am $day hab ich frei.");
        // else Teil der Bedingung, also wenn day alles außer Samstag/Sonntag übergibt (Montag - Freitag)
        } else {
            // Trifft dies zu, wird der entsprechende Wochentag (Montag - Freitag) in $day eingesetzt und
            // Am $day muss ich arbeiten in der Konsole ausgegeben.
            println("Am $day muss ich arbeiten.");
        }
        // Da die Liste mit Montag beginnt und bis Sonntag alle Wochentage aufzählt, ist die if Bedingung für die ersten
        // fünf day Übergaben als false gekennzeichnet und else als true. Somit wird erst fünfmal else ausgeführt und
        // anschließend ist zweimal if Bedingung true (da Samstag, darauf Sonntag aus der Liste übergeben wird) und dann
        // entsprechend in der Konsole ausgegeben.
    }
    // Sobald der letzte Eintrag aus der Liste abgerufen wurde, endet die for-Schleife
}
// Ende des Programmes