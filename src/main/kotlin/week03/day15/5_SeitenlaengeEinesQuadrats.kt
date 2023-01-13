import kotlin.math.sqrt

fun main() {
    sqrtSquare(64.0)
    sqrtSquare(1089.0)
}

fun sqrtSquare(number: Double) {
    val lateralLenght: Double = sqrt(number)
    println(lateralLenght)
}