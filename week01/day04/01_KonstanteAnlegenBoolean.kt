//fun main() {
//    // Lege hier nach den Vorgaben eine Konstante vom Typ Bool an und lasse dir den Typ ausgeben

//    println("${isEarthFlat::class.simpleName}")
//}


fun main() {
    // Lege hier nach den Vorgaben eine Konstante vom Typ Bool an und lasse dir den Typ ausgeben
    val isEarthFlat: Boolean = false
    println("Ist die Erde eine Scheibe?\n" +
            "Antwort: $isEarthFlat!\n" +
            "Die Antwort \"$isEarthFlat\" ist ein \"${isEarthFlat::class.simpleName}\".")
}
