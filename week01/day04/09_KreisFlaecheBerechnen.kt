//fun main(){
//    val PI : Double = 3.14 // Nicht ganz Pi, aber es reicht für unseren Zweck.
//
//    //TODO : Hier muss noch die richtige Variable für den Radius intitialisiert werden.
//
//    radius = readln().toDouble()// Hier wird eine Eingabe vom Benutzer angenommen. Diese muss in einen geeigneten Datentypen umgewandelt werden mit .toDouble() !!
//
//    var flaeche : Double // TODO : Den Wert für die Fläche der Variable flaeche zuordnen. Die Fläche eines Kreises wird wie folgt berechnet. PI * Radius * Radius
//
//    // TODO : Gib das Ergebnis für die Fläche aus. Benutze hierzu die println()-Funktion.
//}

fun main(){
    val PI: Double = 3.14 // Nicht ganz Pi, aber es reicht für unseren Zweck.

    var radius: Double //TODO : Hier muss noch die richtige Variable für den Radius intitialisiert werden.
    print("Gebe ein Radius an: ")
    radius = readln().toDouble()// Hier wird eine Eingabe vom Benutzer angenommen. Diese muss in einen geeigneten Datentypen umgewandelt werden mit .toDouble() !!

    var flaeche : Double = PI.times(radius.times(radius)) // TODO : Den Wert für die Fläche der Variable flaeche zuordnen. Die Fläche eines Kreises wird wie folgt berechnet. PI * Radius * Radius

    println("\nDie Kreisfläche mit dem Radius von \"$radius\" beträgt \"$flaeche\".") // TODO : Gib das Ergebnis für die Fläche aus. Benutze hierzu die println()-Funktion.
}
