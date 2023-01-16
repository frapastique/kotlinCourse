fun main(){

    val wochenTage: List<String> = listOf("Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag")

    // ---- Vorgehen beim Schleifen implementieren ----
    // 1. Laufvariable erstellen: heißt meistens einfach "i", das steht für für Iterator

    var i: Int = 0

    // 2. Schleifenbedingung überlegen: Die Schleife soll nicht unendlich weiterlaufen.
    // Wir wollen die Liste wochenTage durchgehen. Das heißt, die Schleife soll so lange laufen, wie die Liste lang ist. Deshalb:

    while (i < wochenTage.size){

        // 3. Anweisung, was ausgeführt werden soll. Wir wollen jedes Element der Liste, also jeden Wochentag, ausprinten.
        // Dafür können wir jetzt praktischerweise einfach i an die Stelle des ListenIndex schreiben:
        println(wochenTage[i])

        // 4. wichtig, damit die Schleife nicht unendlich weiterläuft und damit nicht immer derselbe Wochentag ausgegeben wird: i erhöhen!
        i++
    }
}
/* Fertig ist die Schleife! Noch eine Verständnisfrage:
    Warum verwenden wir
    (i < wochenTage.size) und nicht etwa
    (i <= wochenTage.size)?
    Probiert aus, was passiert, wenn ihr den < Operator durch <= ersetzt und beantwortet, welcher Fehler auftritt und weshalb!

*/

