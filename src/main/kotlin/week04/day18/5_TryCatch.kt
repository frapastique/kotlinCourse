fun main() {
    try {
        divideByZero(7)
    } catch (e: Exception) {
        println("Es wurde versucht mit Null (0) zu teilen, dies ist nicht möglich!")
    }
}

fun divideByZero(number: Int): Int {
    return number / 0
}
