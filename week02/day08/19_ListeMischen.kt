fun main() {
    /*
     numbers ist eine Liste mit sortierten Zahlen. Wir wollen diese jetzt aber durchmischen.
     Beispiel: [10,20,30,40] -> [30,10,40,20].
     Hinweis: Das Mischen passiert zufällig, es können also unterschiedliche Ergebnisse entstehen.
     Benutze eine Methode für Listen, um die Reihenfolge von numbers zu verändern und speichere diese in einer neuen Variable ab.
     */
    var numbers: MutableList<Int> = mutableListOf(1,2,5,4,5,6,7,8)
    //TODO füge hier deinen Code ein
    var numbersShuffled = numbers.shuffled()
    println(numbers)
    println(numbersShuffled)
}