fun main() {
    /*
    Wir wollen in dieser Aufgabe eine Liste von Integern in eine logische Reihenfolge bringen.
    Beispiel: Eine Liste [3,5,2,1] soll am Ende so aussehen: [1,2,3,5].
    Erstellt eine neue Variable, in der ihr die neue Liste speichert.
    Benutze dafür die in der Vorlesung vorgestelle Methode.
     */
    var unsortedList: MutableList<Int> = mutableListOf(8,3,2,9,7,1)
    //TODO füge hier deinen Code ein
    var sortedList = unsortedList.sorted()
    println(unsortedList)
    println(sortedList)
}