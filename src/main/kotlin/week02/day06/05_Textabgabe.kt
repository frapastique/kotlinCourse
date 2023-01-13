fun main() {
    var houseNumbers: List<Int> = listOf(23, 25, 27, 29)
    var houseNumber: Int = houseNumbers[houseNumbers.size-1]
    println("Vorhersage:            3") // Dachte erst es wird die Anzahl über wie viele Inhalte in der Liste angelegt sind, also 4 minus 1 also drei
    println("Vorhersage korrigiert: 29") // Doch nach dem printen habe ich verstanden, dass hier die Anzahl der angelegten Inhalten, also vier minus 1 also drei, und dann der vierte Inhalt geprintet wird.
    println("Lösung:                $houseNumber")
}
