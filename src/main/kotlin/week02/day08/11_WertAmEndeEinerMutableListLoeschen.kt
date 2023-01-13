fun main () {
    // Lösche das letzte Element der MutableList mit einer Funktion, die du aus der Vorlesung kennst.
    var fruits: MutableList<String> = mutableListOf("Birnen", "Bananen", "Orangen", "Kirschen")
    // Dein Code hier:
    fruits.remove(fruits.last())
}