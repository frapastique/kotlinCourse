/*
Schreibe hier deine Antwort hin.
        PH
        Microsoft
 */

// Anlegen der main Funktion
fun main() {
    // Liste brands mit den Marken: "Samsung", "Apple", "PH", "Microsoft"
    val brands: List<String> = listOf("Samsung", "Apple", "PH", "Microsoft")
    // for-Schleife innerhalb dessen mit i die Integer 2 und größe der Liste minus eins also 3
    // nacheinander übergeben werden
    for (i in 2..brands.size - 1) {
        // In der Konsole wird der Inhalt der Liste am Index i ausgegeben
        // beginnend mit Index 2, also PH. Dann der Wert am Index 3, somit Microsoft
        println(brands[i])
    }
    // Sobald über die zwei Zahlen iteriert wurde, bricht die for-Schleife ab.
}
// Ende des Programmes