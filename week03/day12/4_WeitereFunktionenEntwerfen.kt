package week.`3`.day.`12`.Tag12_Projekt

import kotlin.math.roundToInt

/*
a) - Schreibe eine Funktion mit dem Namen doppelterWert.
   - Lege in der Funktion eine Variable vom Typ Int mit dem Wert 12 an.
   - Verdreifache den Wert der Variable und gib sie zurück.

   Rufe dann die Funktion in der main() Funktion, wie in den vorherigen Teilaufgaben,
   auf und gib das Ergebnis in der Konsole aus.
   Ist das Ergebnis 36?
 */

fun doppelterWert(): Int {
    var number12: Int = 12
    return number12.times(3)
}

/*
b) Wir bauen uns eine kleine Videothek.

   - Schreibe eine Funktion mit einem beliebigen Namen.
   - Lege in der Funktion eine Liste vom Typ String an, die Liste soll initial folgende Werte besitzen:
     "Star Wars", "Shrek", "Toy Story"
     Das sind unsere Filme.
   - Gebe dann in der Funktion eine Begrüßung und die Filme in der Konsole aus.
     Frage dann den Nutzer, welchen Film er ausleihen möchte.
   - Nimm dann eine Eingabe über die Konsole entgegen, die Eingabe ist ein Index für die Liste an Filmen.
     (Also ein Integer zwischen 0 und 2).
   - Gib dann den Film für den eingegebenen Index zurück.

     Rufe dann die Funktion in der main() Funktion, wie in den vorherigen Teilaufgaben,
     auf und gib das Ergebnis in der Konsole aus.
 */

fun videothek(): String {
    var listOfMovies: List<String> = listOf("Star Wars", "Shrek", "Toy Story",)
    println("Sei gegrüßt! Folgende Filme habe ich parat:\n$listOfMovies")
    var askMovie: String ?
    print("Welchen Film möchtest du ausleihen? - ")
    askMovie = readln().toString()
    while (!listOfMovies.contains(askMovie)) {
        println("Den Film \"$askMovie\" haben wir nicht gelistet.")
        print("Gebe einen Film den wir gelistet haben an: ")
        askMovie = readln().toString()
    }
    return "Hier dein Film \"$askMovie\"!"
}

/*
c) Du kannst dir als Hilfe für diese Aufgabe die Aufgaben aus der zweiten Woche anschauen.

   - Schreibe eine Funktion mit beliebigen Namen.
   - Lege in der Funktion eine passende MutableMap an.
     Ein Paar der MutableMap besteht aus dem Namen einer Person (als Schlüssel)
     und dem Alter einer Person (Als Wert).
   - Fülle dann die MutableMap mit drei Personen, der Name sowie das Alter werden
     über die Konsole eingegeben.
   - Gebe dann mit Funktionen, die du in der letzten Woche gelernt hast, die jüngste
     Person sowie die älteste Person aus.
   - Gebe das durchschnittliche Alter aller Personen aus.
   - Gebe das summierte Alter aller Personen aus.
   - Gebe dann die MutableMap zurück.

   Prüfe deine Funktion, indem du sie in der Main-Funktion aufrufst.
   Gib beim Ausführen deines Programs die folgenden drei Personen ein.

   "Herbert" to 46,
   "Gundula" to 85,
   "Franz" to 37,
 */

fun randomName() {
    var mutableMapOfPersons: MutableMap<String, Int> = mutableMapOf(
        "Herbert" to 46,
        "Gundula" to 85,
        "Franz" to 37,
    )

    var youngestAge: Int = Int.MAX_VALUE
    var youngestName: String = ""

    for ((name, age) in mutableMapOfPersons) {
        if (age < youngestAge) {
            youngestAge = age
            youngestName = name
        }
    }
    println("Die jüngste Person ist $youngestName mit einem Alter von $youngestAge!")

    var oldestAge: Int = Int.MIN_VALUE
    var oldestName: String = ""

    for ((name, age) in mutableMapOfPersons) {
        if (age > oldestAge) {
            oldestAge = age
            oldestName = name
        }
    }
    println("Die älteste Person ist $oldestName mit einem Alter von $oldestAge!")

    val averageAge: Int = mutableMapOfPersons.values.average().roundToInt()
    println("Das durchschnittliche Alter aller Personen ist $averageAge Jahre!")
    println(mutableMapOfPersons)
}

/*
d) Die letzte Aufgabe ist etwas kreativer, wir bauen eine Funktion, die einen Würfelwurf simuliert.

   - Erstelle eine Funktion, die einen Würfelwurf simuliert. D.h. die Funktion gibt
     mit gleicher Wahrscheinlichkeit einen Integer zwischen 1 und 6 aus.
 */

fun diceRoll(): Int {
    var dice: Int = (1..6).random()
    return dice
}

fun main() {
//    println(doppelterWert())
//    println(videothek())
    randomName()
    println(diceRoll())
}