// Programm start
fun main() {
    // Mutable Liste mit Strings die Eingekauft werden sollen
    val shoppingList: MutableList<String> = mutableListOf(
        "Reis", "Tofu", "Brokkoli", "Nudeln", "Apfelsaft",
        "Zitronen", "Eis", "Erdbeeren", "Torte"
    )
    // Konsolen ausgabe der ursprünglichen Liste
    println(shoppingList)
    // for-Schleife um über den Integer 0 - 9 (bis eins kleiner größe der Liste) zu iterieren und als i weiterreichen
    for (i in 0 until shoppingList.size) {
        // Platzhalter Variable für den Neuen String. i + 1 als Stelle und String der Liste am Index i
        var newString: String = "${i + 1}. ${shoppingList[i]}"
        // Ersetzt den ursprünglichen String am Index i mit dem neuen String
        shoppingList.set(i, newString)
    }
    // for-Schleife zu Ende, sobald über alle Integer iteriert wurde
    // Konsolen ausgabe der Liste mit den neuen Werten
    println(shoppingList)
}