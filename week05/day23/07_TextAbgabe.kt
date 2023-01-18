/*
Schreibe hier deine Antwort hin.
        Auf der 0. Strasse kann man 30km/h fahren.
        Auf der 2. Strasse kann man 80km/h fahren.
        Auf der 4. Strasse kann man 120km/h fahren.
 */

// Programm start
fun main() {
    // Liste speedLimits werden die erlaubten Geschwindigkeiten als Integer festgelegt
    val speedLimits: List<Int> = listOf(30, 50, 80, 100, 120)
    // for-Schleife welche über die Integer 0 - größer der speedLimits Liste minus 1 (5-1=4) iteriert wird
    // also 0, 1, 2, 3, 4 und darauf als Variable i weitergegeben wird
    for (i in 0..speedLimits.size - 1) {
        // if-Bedingung, Vergleich ob in der Liste speedLimits am Integer i der Wert 30 gegeben ist
        if (speedLimits[i] == 30) {
            // Trifft die Bedingung zu, wird Variable i mit entsprechenden Integer ersetzt und speedLimits[i]
            // mit entsprechendem Integer aus der Liste speedLimits am Index i ersetzt und darauf als String
            // in der Konsole ausgegeben
            println("Auf der " + i + ". Strasse kann man " + speedLimits[i] + "km/h fahren.")
        // else if-Bedingung, Vergleich ob in der Liste speedLimits am Integer i der Wert 80 gegeben ist
        } else if (speedLimits[i] == 80) {
            // Trifft die Bedingung zu, wird Variable i mit entsprechenden Integer ersetzt und speedLimits[i]
            // mit entsprechendem Integer aus der Liste speedLimits am Index i ersetzt und darauf als String
            // in der Konsole ausgegeben
            println("Auf der " + i + ". Strasse kann man " + speedLimits[i] + "km/h fahren.")
        // else if-Bedingung, Vergleich ob in der Liste speedLimits am Integer i der Wert 120 gegeben ist
        } else if (speedLimits[i] == 120) {
            // Trifft die Bedingung zu, wird Variable i mit entsprechenden Integer ersetzt und speedLimits[i]
            // mit entsprechendem Integer aus der Liste speedLimits am Index i ersetzt und darauf als String
            // in der Konsole ausgegeben
            println("Auf der " + i + ". Strasse kann man " + speedLimits[i] + "km/h fahren.")
        }
    // Die for-Schleife wird beendet, sobald über alle zuvor festgelegte Integer iteriert und dessen if-Bedingungen
    // überprüft wurden und dessen code Blöcke ausgeführt wurden.
    }
}
// Ende des Programmes