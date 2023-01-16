//fun main(){
//    // Gordon hat 7 Geschwister. Außerdem hat er auch 65 Melonen, von denen er so viele wie möglich mit seinen 7 Geschwistern gerecht teilen will.
//    // Wie viele Melonen hat er übrig, wenn alle Geschwister gleich viele Melonen haben?
//    // Löse außerdem mögliche Compilerfehler.
//    // Tipp: Die Anzahl der Melonen durch modulo Anzahl der Geschwister teilen.
//    // Gib das Ergebnis über den println()-Befehl aus.
//
//    val melonen : Int = 65
//    val geschwister 7
//    val rest : Int
//}

fun main(){
    // Gordon hat 7 Geschwister. Außerdem hat er auch 65 Melonen, von denen er so viele wie möglich mit seinen 7 Geschwistern gerecht teilen will.
    // Wie viele Melonen hat er übrig, wenn alle Geschwister gleich viele Melonen haben?
    // Löse außerdem mögliche Compilerfehler.
    // Tipp: Die Anzahl der Melonen durch modulo Anzahl der Geschwister teilen.
    // Gib das Ergebnis über den println()-Befehl aus.


    val melonen: Int = 65
    val geschwister: Int = 7
    val rest: Int = melonen.rem(geschwister)

    println("Gordon hat am Ende noch $rest Melonen übrig.")
}
