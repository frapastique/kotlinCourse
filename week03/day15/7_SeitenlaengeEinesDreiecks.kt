import kotlin.math.*

fun main() {
    rectangleC(4.2, 6.5)
    rectangleC(12.56, 3.56)
}

fun rectangleC(a: Double, b: Double) {
    val calcC: Double = sqrt(a.pow(2) + (b.pow(2)))
    println(calcC)
}