fun main() {
    val numbers: MutableList<Double> = mutableListOf(25.0, 33.3, 50.0, 100.0)
    println(numbers)
    println(multiNumbers(7, numbers))
    var i: Int = 0
    while (i < numbers.size) {
        var newNumber: Double = numbers[i].times(3)
        numbers[i] = newNumber
        i++
    }
    println(numbers)
}

fun multiNumbers(number: Int, liste: MutableList<Double>): MutableList<Double> {
    var i: Int = 0
    for (multi in liste) {
        var newNumber: Double = liste[i].times(number)
        liste[i] = newNumber
        i++
    }
    return liste
}