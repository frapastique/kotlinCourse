fun main() {
    numbersDouble(123.45, 76.55)
}

fun numbersDouble(number0: Double, number1: Double) {
    var sum: Double =  number0.plus(number1)
    println("Die Summe von $number0 + $number1 ist $sum!")
}