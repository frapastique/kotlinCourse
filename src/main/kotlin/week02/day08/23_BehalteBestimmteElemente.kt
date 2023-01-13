fun main() {
    /*
    In dieser Aufgabe wollen wir alle ungeraden Zahlen, also 5,3 und 9 aus unserer Liste numbers entfernen.
    Unsere Liste soll am Ende also nur noch folgendermaßen aussehen: [2,8].
    Die ungeraden Zahlen aus der Liste zu entfernen geht in einem Schritt. Benutzt dafür eine Funktion, die in der Vorlesung vorgestellt wurde.
    Beispiel: [1,2,3,4,5] --> [1,2,3]
    Erstellt eine neue Variable, in der ihr die neue Liste speichert.
     */
    var numbers: MutableList<Int> = mutableListOf(2,5,3,9,8)
    val evenNumbers: List<Int> = listOf(2,8) // Ihr könnt diese Liste als Hilfsmittel benutzen
    //TODO füge hier deinen Code ein
    var numbersEven = numbers.retainAll(evenNumbers)
    println(evenNumbers)
}