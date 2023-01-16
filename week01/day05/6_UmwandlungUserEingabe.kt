//fun main () {
//    // In dieser Datei bitte erst ab dem ersten TODO arbeiten!
//    var unserInteger : Int = 15
//    var unserDouble : Double = 23.2
//
//    println("Hier kann der User etwas Eingeben:")
//    var eingabe : String = readln()
//
//    /* TODO: In dieser Datei sind einige Code Passagen auskommentiert. Sollten die Kommentar-Striche
//     *  am Anfang einer Zeile stehen, so ist diese Zeile zum Bearbeiten einzukommentieren.
//     *  Nutze hierfür die Tastenkombination zum Kommentieren, um etwas wieder einzukommentieren!
//     *  Nun soll unsere Eingabe in unsere bereits erstellten Variablen gespeichert werden.
//     *  Wandle hierfür die Eingabe in entsprechende Datentypen um und speichere diese in den Variablen.
//     */
//
////    var eingegebenerDouble : Double =
////    var eingegebenerInt : Int =
//
//    /* TODO: Nun wollen wir ein paar Rechenoperationen machen mit unseren Zahlen. Dafür müssen wir
//     *  darauf achten, die Variablen in die richtigen Datentypen zu konvertieren.
//     */
//
////    var ergebnisDoubleAlsInt : Int = eingegebenerDouble * eingegebenerDouble
////    var ergebnisIntAlsDouble : Double = eingegebenerInt * eingegebenerInt
////    var ergebnisBeider : Double = ergebnisIntAlsDouble / ergebnisDoubleAlsInt
////    var ergebnisString : String = ergebnisBeider
//
//    // Hier werden dann einmal alle Daten auf der Konsole ausgegeben.
////    println(unserInteger)
////    println(unserDouble)
////    println(ergebnisDoubleAlsInt)
////    println(ergebnisIntAlsDouble)
////    println(ergebnisBeider)
////    println(ergebnisString)
//
//    /* TODO: Was für ein Fehler kann hierbei auftreten, wenn wir den Wert, den wir von der Konsole bekommen,
//     *  direkt in eine Zahl umwandeln wollen? Schreibe die Lösung hierunter.
//     *
//     *
//     */
//
//
//}

fun main () {
    // In dieser Datei bitte erst ab dem ersten TODO arbeiten!
    var unserInteger : Int = 15
    var unserDouble : Double = 23.2

    println("Hier kann der User etwas Eingeben:")
    var eingabe : String = readln()


    /* TODO: In dieser Datei sind einige Code Passagen auskommentiert. Sollten die Kommentar-Striche
     *  am Anfang einer Zeile stehen, so ist diese Zeile zum Bearbeiten einzukommentieren.
     *  Nutze hierfür die Tastenkombination zum Kommentieren, um etwas wieder einzukommentieren!
     *  Nun soll unsere Eingabe in unsere bereits erstellten Variablen gespeichert werden.
     *  Wandle hierfür die Eingabe in entsprechende Datentypen um und speichere diese in den Variablen.
     */

    println("\n")
    var eingegebenerDouble: Double = eingabe.toDouble()
    println(eingegebenerDouble)
    var eingegebenerInt: Int = eingabe.toInt()
    println(eingegebenerInt)

    /* TODO: Nun wollen wir ein paar Rechenoperationen machen mit unseren Zahlen. Dafür müssen wir
     *  darauf achten, die Variablen in die richtigen Datentypen zu konvertieren.
     */

    println("\n")
    var ergebnisDoubleAlsInt : Int = eingegebenerDouble.toInt() * eingegebenerDouble.toInt()
    println(ergebnisDoubleAlsInt)
    var ergebnisIntAlsDouble : Double = eingegebenerInt.toDouble() * eingegebenerInt.toDouble()
    println(ergebnisIntAlsDouble)
    var ergebnisBeider : Double = ergebnisIntAlsDouble / ergebnisDoubleAlsInt.toDouble()
    println(ergebnisBeider)
    var ergebnisString : String = ergebnisBeider.toString()
    println(ergebnisString)


    // Hier werden dann einmal alle Daten auf der Konsole ausgegeben.
    println("\n")
    println(unserInteger)
    println(unserDouble)
    println(ergebnisDoubleAlsInt)
    println(ergebnisIntAlsDouble)
    println(ergebnisBeider)
    println(ergebnisString)

    /* TODO: Was für ein Fehler kann hierbei auftreten, wenn wir den Wert, den wir von der Konsole bekommen,
     *  direkt in eine Zahl umwandeln wollen? Schreibe die Lösung hierunter.
     *
     *
     */
    println("\n")
    println("Wenn das Ergebnis ein Double mit Nachkommastelle ist und man diese dann zu einem Integer umwandeln möchte würde eine Exeption geworfen werden.\n" +
            "Zudem muss der User, damit das Programm startet ein Integer eintippen! Kein Double und kein String, sonst würde ebenfalls ein Fehler auftreten.")
}
