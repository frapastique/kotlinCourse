package week.`3`.day.`14`.Tag14_Projekt.Aufgabe3.src

fun main() {
    numbersInt(25, 40, 100)
}

fun numbersInt(number0: Int, number1: Int, number2: Int) {
    var multiplikationFirstTwoNumbers: Int = number0.times(number1)
    var subtraktionPrevious: Int = multiplikationFirstTwoNumbers.minus(number2)
    println("Multipliziert man $number0 und $number1 beträgt das Produkt $multiplikationFirstTwoNumbers.\n" +
            "Subtrahiert man $number2 von $multiplikationFirstTwoNumbers beträgt die Differenz $subtraktionPrevious!")
}