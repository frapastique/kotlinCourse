import kotlin.math.PI

fun main() {
    circumfenceCircle(5.5)
}

fun circumfenceCircle(radius: Double) {
    val circleCircumfence: Double = 2 * PI * radius
    println("Der Umfang des Kreises mit Radius = $radius beträgt $circleCircumfence")
}