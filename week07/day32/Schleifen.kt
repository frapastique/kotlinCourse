fun main() {

    /* Gib die Zahlen von 1 bis 30 mit einer schleife aus. */
    println("Gib die Zahlen von 1 bis 30 mit einer schleife aus:")
    for (i in 1 .. 30) {
        println(i)
    }

    /* Gib jede dritte Zahl von 1 bis 30 mit einer schleife aus. */
    println("\nGib jede dritte Zahl von 1 bis 30 mit einer schleife aus:")
    for (i in 1 .. 30 step 3) {
        println(i)
    }

    /* Gib die Zahlen von 1 bis 30 mit einer schleife rückwärts aus. */
    println("\nGib die Zahlen von 1 bis 30 mit einer schleife rückwärts aus:")
    for (i in 30 downTo 1) {
        println(i)
    }

    /* Gib jede 7. Zahl von 1 bis 30 mit einer schleife rückwärts aus. */
    println("\nGib jede 7. Zahl von 1 bis 30 mit einer schleife rückwärts aus:")
    for (i in 30 downTo 1 step 7) {
        println(i)
    }

    /* Verwende eine Schleife, um alle Elemente der Liste auszugeben. */
    val liste1 = listOf("Ich ", "bin ", "ein ", "kleiner ", "Kaktus.")
    println("\nVerwende eine Schleife, um alle Elemente der Liste auszugeben:")
    for (i in liste1) {
        println(i)
    }

    /* Verwende eine Schleife, um alle Elemente der Liste rückwärts auszugeben. */
    val liste2 = listOf("Kaktus.", "kleiner ", "ein ", "bin ", "Ich ")
    println("\nVerwende eine Schleife, um alle Elemente der Liste rückwärts auszugeben:")
    for (i in liste2.size - 1 downTo 0) {
        println(liste2[i])
    }

    /* Verwende eine Schleife, um die Anzahl der Elemente einer Liste zu zählen. */
    val liste3 = listOf(
        "Mein", "kleiner", "grüner", "Kaktus", "Steht", "draußen", "am", "Balkon",
        "Hollari", "hollari", "hollaro", "Was", "brauch'", "ich", "rote", "Rosen?",
        "Was", "brauch'", "ich", "roten", "Mohn?", "Hollari", "hollari", "hollaro",
    )
    println("\nVerwende eine Schleife, um die Anzahl der Elemente einer Liste zu zählen:")
    var element: Int = 0
    for (i in liste3.indices) {
        element += 1
    }
    println(element)

    /* Verwende eine Schleife, um die Zahlen in einer Liste zu summieren. */
    val liste4 = listOf(23, 465, 456, 24, 46, 2, 7, 79, 2435, 1, 564, 4, 46, 568, 5, 234, 23, 5)
    println("\nVerwende eine Schleife, um die Zahlen in einer Liste zu summieren:")
    var summe: Int = 0
    for (i in liste4) {
        summe += i
    }
    println(summe)

    /* Verwende eine Schleife, um die Anzahl der Zahl 42 in der Liste zu zählen. */
    val liste5 = listOf(23, 465, 42, 456, 24, 42, 46, 2, 7, 79, 2435, 1, 564, 42, 4, 46, 568, 5, 42, 234, 23, 5)
    println("\nVerwende eine Schleife, um die Anzahl der Zahl 42 in der Liste zu zählen:")
    var number42: Int = 0
    for (i in liste5) {
        if (i == 42) {
            number42 += 1
        }
    }
    println(number42)

    /* Verwende eine Schleife, um die Position (= den Index) eines Elements einer Liste zu finden
    * Gesucht wird der Index des Strings "Balkon".
    * */
    val liste6 = listOf(
        "Mein", "kleiner", "grüner", "Kaktus", "Steht", "draußen", "am", "Balkon",
        "Hollari", "hollari", "hollaro", "Was", "brauch'", "ich", "rote", "Rosen?",
    )
    println("\nVerwende eine Schleife, um die Position (= den Index) des Elements 'Balkon' einer Liste zu finden:")
    for (i in liste6) {
        if (i == "Balkon") {
            println(liste6.indexOf(i))
        }
    }

    /* Verwende eine Schleife, um alle Schlüssel für einen gegebenen Wert in einer Map zu finden
    * Gesucht werden alle Schlüssel, die auf "Hallo" zeigen.
    * */
    val map = mapOf(
        42.23 to "Hallo",
        32.53 to "Welt",
        23.43 to "Hallo",
        62.28 to "Haus",
        16.96 to "Hallo",
    )
    println("\nVerwende eine Schleife, um alle Schlüssel für den Wert 'Hallo' in einer Map zu finden")
    for (i in map.entries) {
        if (i.value == "Hallo") {
            println(i.key)
        }
    }
}
