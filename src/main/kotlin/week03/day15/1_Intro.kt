// Ein Package ist ein Bündel Code, den andere Personen geschrieben haben.
// Ein Package importiert man mit dem import Befehl.

// Hier importieren wir das math-Package (Mathematik-Package) von Kotlin.
import kotlin.math.*

// Das math-Package enthält viele verschiedene, nützliche Funktionen um z.B. die größere Zahl von zwei Zahlen
// herauszufinden. (max()-Funktion).
// Der Stern steht dabei dafür, dass wir alle Funktionen aus dem math-Package importieren wollen.

fun main() {

    // Nach dem import können wir einfach die Funktionen aus dem Package aufrufen, wie wir diese Woche gelernt haben.
    // Z.B. wir bestimmen die größere von zwei Zahlen. Lass das Program durchlaufen und schau dir das Ergebnis in der Konsole an.
    val maximum: Int = max(12, 48)
    println("Die größere Zahl ist $maximum.")

    // Eine weitere Funktion is z.B. die floor()-Funktion, die eine Zahl auf die nächste ganze Zahl abrundet.
    // Lass dazu erneut das Program laufen und schau dir das Ergebnis in der Konsole an.
    val abgerundet = floor(67.89)
    println("67.89 abgerundet ist $abgerundet.")

    // Alle Funktionen des math-Packages sind in der Kotlin-Dokumentation beschrieben.
    // Einen Link zu der Dokumentation findet ihr in der Aufgabenbeschreibung unter Hinweise.
    // Nimm dir ein paar Minuten Zeit und verschaffe dir einen Überblick über die Funktionen im math-Package.
}