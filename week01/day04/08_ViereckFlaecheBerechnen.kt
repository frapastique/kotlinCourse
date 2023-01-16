//fun main(){
//    // Wichtig: Der readln()-Befehl gibt einen Wert des Typen String zurück. Dieser muss mit dem Anhang .toInt() erweitert werden, um in dem Fall unsere Eingabe in ein Int umzuwandeln.
//
//    var laenge : Int
//    laenge = readln().toInt()
//
//    var breite : Int  //TODO : Nimm eine Eingabe an, welche der Breite zugeordnet wird.
//
//    var flaeche : Int  //TODO : Die Flaeche eines Vierecks wird wie folgt berechnet : Breite * Flaeche
//
//    println("$flaeche")
//}

fun main(){
    // Wichtig: Der readln()-Befehl gibt einen Wert des Typen String zurück. Dieser muss mit dem Anhang .toInt() erweitert werden, um in dem Fall unsere Eingabe in ein Int umzuwandeln.

    var laenge: Int
    print("Gebe eine Länge an: ")
    laenge = readln().toInt()

    var breite : Int  //TODO : Nimm eine Eingabe an, welche der Breite zugeordnet wird.
    print("Gebe eine Breite an: ")
    breite = readln().toInt()

    var flaeche : Int = laenge.times(breite) //TODO : Die Flaeche eines Vierecks wird wie folgt berechnet : Breite * Flaeche

    println("\nDie Fläche des Vierecks mit der Länge von \"$laenge\" und Breite von \"$breite\" beträgt \"$flaeche\".")
}
