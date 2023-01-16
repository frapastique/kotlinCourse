fun main() {
    /*
    Hier ist jetzt nochmal eine etwas knifflige Aufgabe zum Listenindex.
    Wir möchten die Stelle in der Liste finden, an der "Pam" das letzte Mal auftaucht.
    Beispiel: in dieser Liste ["A", "Y", "A", "D"] taucht das "A" zuletzt bei Index 2 auf.
    Erstellt eine neue Variable, in dem ihr den Index speichert.
    Benutze dafür die in der Vorlesung vorgestelle Methode.
     */
    var names: MutableList<String> = mutableListOf("Jim", "Pam", "Oscar", "Pam", "Dwight")
    //TODO füge hier deinen Code ein
    var index = names.lastIndexOf("Pam")
    println(index)
}