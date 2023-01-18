// Programm Start
fun main() {
    // Liste mit Strings für einen Satz
    val satz: List<String> = listOf("Tag ", "schöner ", "sehr ", "ein ", "ist ", "Heute ")
    // Konsolen ausgabe der Liste
    println(satz)

    var i: Int = satz.size - 1
    while (i >= 0) {
        print(satz[i])
        i--
    }
    println("\n")

    for (i in satz.size - 2 downTo 0 step 2) {
        print(satz[i])
    }
    println("\n")

    var j: Int = satz.size -1
    do {
        print(satz[j])
        j--
    } while (j >= 3)
}