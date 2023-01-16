import kotlin.math.*

fun main() {
    intAbsolute(-42)
    intAbsolute(20)
}

fun intAbsolute(zahl: Int) {
    val absoluteInt: Int = abs(zahl)
    println(absoluteInt)
}