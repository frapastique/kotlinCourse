/*
Schreibe hier deine Antwort hin.
        Das Buch an der Stelle 0 ist Harry Potter.
        Das Buch an der Stelle 1 ist Herr der Ringe.
        Das Buch an der Stelle 2 ist Dune.
        Das Buch an der Stelle 3 ist Eragon.
        Das waren alle Bücher.
 */

// main Funktion wird aufgerufen
fun main() {
    // Anlegen einer Liste namens books mit vier Büchern
    val books: List<String> = listOf("Harry Potter", "Herr der Ringe", "Dune", "Eragon")
    // Anlegen einer for Schleife wo die Variable i über die Zahlen 1 bis größe der Liste - 1 also 3 Iteriert
    for(i in 0..books.size-1) {
        // Festlegen der Value book wo jeweils die Zahl i als Index in der Liste books abgelegt wird
        val book = books[i]
        // Ausgabe des Indexes i des jeweiligen Buches und dessen Namen in der Konsole
        println("Das Buch an der Stelle $i ist $book.")
        // Ende der for Schleife, sobald über den Wert 3 Iteriert wurde
    }
    // Informierung das alle Bücher aus der Liste in der Konsole ausgegeben wurden
    println("Das waren alle Bücher.")
    // Ende der main Funktion
}